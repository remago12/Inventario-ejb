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
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "KARDEX", catalog = "", schema = "INVENTARIO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Kardex.findAll", query = "SELECT k FROM Kardex k"),
    @NamedQuery(name = "Kardex.findByKardexId", query = "SELECT k FROM Kardex k WHERE k.kardexPK.kardexId = :kardexId"),
    @NamedQuery(name = "Kardex.findByProductoId", query = "SELECT k FROM Kardex k WHERE k.kardexPK.productoId = :productoId"),
    @NamedQuery(name = "Kardex.findByEstado", query = "SELECT k FROM Kardex k WHERE k.estado = :estado"),
    @NamedQuery(name = "Kardex.findByDescripcion", query = "SELECT k FROM Kardex k WHERE k.descripcion = :descripcion")})
public class Kardex implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected KardexPK kardexPK;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ESTADO")
    private Character estado;
    @Size(max = 500)
    @Column(name = "DESCRIPCION")
    private String descripcion;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "kardex", fetch = FetchType.LAZY)
    private List<Kardexentrada> kardexentradaList;
    @JoinColumn(name = "PRODUCTO_ID", referencedColumnName = "PRODUCTO_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Producto producto;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "kardex", fetch = FetchType.LAZY)
    private List<Kardexsalida> kardexsalidaList;

    public Kardex() {
    }

    public Kardex(KardexPK kardexPK) {
        this.kardexPK = kardexPK;
    }

    public Kardex(KardexPK kardexPK, Character estado) {
        this.kardexPK = kardexPK;
        this.estado = estado;
    }

    public Kardex(long kardexId, long productoId) {
        this.kardexPK = new KardexPK(kardexId, productoId);
    }

    public KardexPK getKardexPK() {
        return kardexPK;
    }

    public void setKardexPK(KardexPK kardexPK) {
        this.kardexPK = kardexPK;
    }

    public Character getEstado() {
        return estado;
    }

    public void setEstado(Character estado) {
        this.estado = estado;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @XmlTransient
    public List<Kardexentrada> getKardexentradaList() {
        return kardexentradaList;
    }

    public void setKardexentradaList(List<Kardexentrada> kardexentradaList) {
        this.kardexentradaList = kardexentradaList;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    @XmlTransient
    public List<Kardexsalida> getKardexsalidaList() {
        return kardexsalidaList;
    }

    public void setKardexsalidaList(List<Kardexsalida> kardexsalidaList) {
        this.kardexsalidaList = kardexsalidaList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (kardexPK != null ? kardexPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Kardex)) {
            return false;
        }
        Kardex other = (Kardex) object;
        if ((this.kardexPK == null && other.kardexPK != null) || (this.kardexPK != null && !this.kardexPK.equals(other.kardexPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.inventario.entidades.Kardex[ kardexPK=" + kardexPK + " ]";
    }
    
}
