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
@Table(name = "TIPOFACTURA", catalog = "", schema = "INVENTARIO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tipofactura.findAll", query = "SELECT t FROM Tipofactura t"),
    @NamedQuery(name = "Tipofactura.findByTipofacturaId", query = "SELECT t FROM Tipofactura t WHERE t.tipofacturaId = :tipofacturaId"),
    @NamedQuery(name = "Tipofactura.findByNombre", query = "SELECT t FROM Tipofactura t WHERE t.nombre = :nombre"),
    @NamedQuery(name = "Tipofactura.findByDescripcion", query = "SELECT t FROM Tipofactura t WHERE t.descripcion = :descripcion")})
public class Tipofactura implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "TIPOFACTURA_ID")
    private Long tipofacturaId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 25)
    @Column(name = "NOMBRE")
    private String nombre;
    @Size(max = 500)
    @Column(name = "DESCRIPCION")
    private String descripcion;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "tipofacturaId", fetch = FetchType.LAZY)
    private List<Compra> compraList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "tipofacturaId", fetch = FetchType.LAZY)
    private List<Factura> facturaList;

    public Tipofactura() {
    }

    public Tipofactura(Long tipofacturaId) {
        this.tipofacturaId = tipofacturaId;
    }

    public Tipofactura(Long tipofacturaId, String nombre) {
        this.tipofacturaId = tipofacturaId;
        this.nombre = nombre;
    }

    public Long getTipofacturaId() {
        return tipofacturaId;
    }

    public void setTipofacturaId(Long tipofacturaId) {
        this.tipofacturaId = tipofacturaId;
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
        hash += (tipofacturaId != null ? tipofacturaId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tipofactura)) {
            return false;
        }
        Tipofactura other = (Tipofactura) object;
        if ((this.tipofacturaId == null && other.tipofacturaId != null) || (this.tipofacturaId != null && !this.tipofacturaId.equals(other.tipofacturaId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.inventario.entidades.Tipofactura[ tipofacturaId=" + tipofacturaId + " ]";
    }
    
}
