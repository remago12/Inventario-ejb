/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.inventario.entidades;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Rene Gomez
 */
@Entity
@Table(name = "SECCION", catalog = "", schema = "INVENTARIO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Seccion.findAll", query = "SELECT s FROM Seccion s"),
    @NamedQuery(name = "Seccion.findBySeccionId", query = "SELECT s FROM Seccion s WHERE s.seccionId = :seccionId"),
    @NamedQuery(name = "Seccion.findByNombre", query = "SELECT s FROM Seccion s WHERE s.nombre = :nombre"),
    @NamedQuery(name = "Seccion.findByDescripcion", query = "SELECT s FROM Seccion s WHERE s.descripcion = :descripcion")})
public class Seccion implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "SECCION_ID")
    private Long seccionId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "NOMBRE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date nombre;
    @Size(max = 500)
    @Column(name = "DESCRIPCION")
    private String descripcion;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "seccion", fetch = FetchType.LAZY)
    private List<Productoinventario> productoinventarioList;
    @JoinColumn(name = "SUCURSAL_ID", referencedColumnName = "SUCURSAL_ID")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Sucursal sucursalId;

    public Seccion() {
    }

    public Seccion(Long seccionId) {
        this.seccionId = seccionId;
    }

    public Seccion(Long seccionId, Date nombre) {
        this.seccionId = seccionId;
        this.nombre = nombre;
    }

    public Long getSeccionId() {
        return seccionId;
    }

    public void setSeccionId(Long seccionId) {
        this.seccionId = seccionId;
    }

    public Date getNombre() {
        return nombre;
    }

    public void setNombre(Date nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @XmlTransient
    public List<Productoinventario> getProductoinventarioList() {
        return productoinventarioList;
    }

    public void setProductoinventarioList(List<Productoinventario> productoinventarioList) {
        this.productoinventarioList = productoinventarioList;
    }

    public Sucursal getSucursalId() {
        return sucursalId;
    }

    public void setSucursalId(Sucursal sucursalId) {
        this.sucursalId = sucursalId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (seccionId != null ? seccionId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Seccion)) {
            return false;
        }
        Seccion other = (Seccion) object;
        if ((this.seccionId == null && other.seccionId != null) || (this.seccionId != null && !this.seccionId.equals(other.seccionId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.inventario.entidades.Seccion[ seccionId=" + seccionId + " ]";
    }
    
}
