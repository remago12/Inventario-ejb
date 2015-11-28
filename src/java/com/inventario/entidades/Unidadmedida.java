/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.inventario.entidades;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Rene Gomez
 */
@Entity
@Table(name = "UNIDADMEDIDA", catalog = "", schema = "INVENTARIO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Unidadmedida.findAll", query = "SELECT u FROM Unidadmedida u"),
    @NamedQuery(name = "Unidadmedida.findByUnidadId", query = "SELECT u FROM Unidadmedida u WHERE u.unidadId = :unidadId"),
    @NamedQuery(name = "Unidadmedida.findByNombre", query = "SELECT u FROM Unidadmedida u WHERE u.nombre = :nombre"),
    @NamedQuery(name = "Unidadmedida.findByAbreviatura", query = "SELECT u FROM Unidadmedida u WHERE u.abreviatura = :abreviatura"),
    @NamedQuery(name = "Unidadmedida.findByDescripcion", query = "SELECT u FROM Unidadmedida u WHERE u.descripcion = :descripcion")})
public class Unidadmedida implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "UNIDAD_ID")
    private Long unidadId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "NOMBRE")
    private String nombre;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "ABREVIATURA")
    private String abreviatura;
    @Size(max = 500)
    @Column(name = "DESCRIPCION")
    private String descripcion;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "unidadId", fetch = FetchType.LAZY)
    private List<Producto> productoList;

    public Unidadmedida() {
    }

    public Unidadmedida(Long unidadId) {
        this.unidadId = unidadId;
    }

    public Unidadmedida(Long unidadId, String nombre, String abreviatura) {
        this.unidadId = unidadId;
        this.nombre = nombre;
        this.abreviatura = abreviatura;
    }

    public Long getUnidadId() {
        return unidadId;
    }

    public void setUnidadId(Long unidadId) {
        this.unidadId = unidadId;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAbreviatura() {
        return abreviatura;
    }

    public void setAbreviatura(String abreviatura) {
        this.abreviatura = abreviatura;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @XmlTransient
    public List<Producto> getProductoList() {
        return productoList;
    }

    public void setProductoList(List<Producto> productoList) {
        this.productoList = productoList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (unidadId != null ? unidadId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Unidadmedida)) {
            return false;
        }
        Unidadmedida other = (Unidadmedida) object;
        if ((this.unidadId == null && other.unidadId != null) || (this.unidadId != null && !this.unidadId.equals(other.unidadId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.inventario.entidades.Unidadmedida[ unidadId=" + unidadId + " ]";
    }
    
}
