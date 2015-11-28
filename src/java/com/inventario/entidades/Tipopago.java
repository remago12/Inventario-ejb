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
@Table(name = "TIPOPAGO", catalog = "", schema = "INVENTARIO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tipopago.findAll", query = "SELECT t FROM Tipopago t"),
    @NamedQuery(name = "Tipopago.findByTipopagoId", query = "SELECT t FROM Tipopago t WHERE t.tipopagoId = :tipopagoId"),
    @NamedQuery(name = "Tipopago.findByNombre", query = "SELECT t FROM Tipopago t WHERE t.nombre = :nombre"),
    @NamedQuery(name = "Tipopago.findByDescripcion", query = "SELECT t FROM Tipopago t WHERE t.descripcion = :descripcion")})
public class Tipopago implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "TIPOPAGO_ID")
    private Long tipopagoId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 25)
    @Column(name = "NOMBRE")
    private String nombre;
    @Size(max = 500)
    @Column(name = "DESCRIPCION")
    private String descripcion;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "tipopagoId", fetch = FetchType.LAZY)
    private List<Compra> compraList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "tipopagoId", fetch = FetchType.LAZY)
    private List<Factura> facturaList;

    public Tipopago() {
    }

    public Tipopago(Long tipopagoId) {
        this.tipopagoId = tipopagoId;
    }

    public Tipopago(Long tipopagoId, String nombre) {
        this.tipopagoId = tipopagoId;
        this.nombre = nombre;
    }

    public Long getTipopagoId() {
        return tipopagoId;
    }

    public void setTipopagoId(Long tipopagoId) {
        this.tipopagoId = tipopagoId;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @XmlTransient
    public List<Compra> getCompraList() {
        return compraList;
    }

    public void setCompraList(List<Compra> compraList) {
        this.compraList = compraList;
    }

    @XmlTransient
    public List<Factura> getFacturaList() {
        return facturaList;
    }

    public void setFacturaList(List<Factura> facturaList) {
        this.facturaList = facturaList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (tipopagoId != null ? tipopagoId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tipopago)) {
            return false;
        }
        Tipopago other = (Tipopago) object;
        if ((this.tipopagoId == null && other.tipopagoId != null) || (this.tipopagoId != null && !this.tipopagoId.equals(other.tipopagoId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.inventario.entidades.Tipopago[ tipopagoId=" + tipopagoId + " ]";
    }
    
}
