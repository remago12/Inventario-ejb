/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.inventario.entidades;

import java.io.Serializable;
import java.math.BigDecimal;
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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Rene Gomez
 */
@Entity
@Table(name = "COMPRADETALLE", catalog = "", schema = "INVENTARIO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Compradetalle.findAll", query = "SELECT c FROM Compradetalle c"),
    @NamedQuery(name = "Compradetalle.findByCompradetalleId", query = "SELECT c FROM Compradetalle c WHERE c.compradetallePK.compradetalleId = :compradetalleId"),
    @NamedQuery(name = "Compradetalle.findByCompraId", query = "SELECT c FROM Compradetalle c WHERE c.compradetallePK.compraId = :compraId"),
    @NamedQuery(name = "Compradetalle.findByCantidad", query = "SELECT c FROM Compradetalle c WHERE c.cantidad = :cantidad"),
    @NamedQuery(name = "Compradetalle.findByPreciounidad", query = "SELECT c FROM Compradetalle c WHERE c.preciounidad = :preciounidad")})
public class Compradetalle implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected CompradetallePK compradetallePK;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Column(name = "CANTIDAD")
    private BigDecimal cantidad;
    @Basic(optional = false)
    @NotNull
    @Column(name = "PRECIOUNIDAD")
    private BigDecimal preciounidad;
    @JoinColumn(name = "PRODUCTO_ID", referencedColumnName = "PRODUCTO_ID")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Producto productoId;
    @JoinColumn(name = "COMPRA_ID", referencedColumnName = "COMPRA_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Compra compra;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "compradetalle", fetch = FetchType.LAZY)
    private List<Kardexentrada> kardexentradaList;

    public Compradetalle() {
    }

    public Compradetalle(CompradetallePK compradetallePK) {
        this.compradetallePK = compradetallePK;
    }

    public Compradetalle(CompradetallePK compradetallePK, BigDecimal cantidad, BigDecimal preciounidad) {
        this.compradetallePK = compradetallePK;
        this.cantidad = cantidad;
        this.preciounidad = preciounidad;
    }

    public Compradetalle(long compradetalleId, long compraId) {
        this.compradetallePK = new CompradetallePK(compradetalleId, compraId);
    }

    public CompradetallePK getCompradetallePK() {
        return compradetallePK;
    }

    public void setCompradetallePK(CompradetallePK compradetallePK) {
        this.compradetallePK = compradetallePK;
    }

    public BigDecimal getCantidad() {
        return cantidad;
    }

    public void setCantidad(BigDecimal cantidad) {
        this.cantidad = cantidad;
    }

    public BigDecimal getPreciounidad() {
        return preciounidad;
    }

    public void setPreciounidad(BigDecimal preciounidad) {
        this.preciounidad = preciounidad;
    }

    public Producto getProductoId() {
        return productoId;
    }

    public void setProductoId(Producto productoId) {
        this.productoId = productoId;
    }

    public Compra getCompra() {
        return compra;
    }

    public void setCompra(Compra compra) {
        this.compra = compra;
    }

    @XmlTransient
    public List<Kardexentrada> getKardexentradaList() {
        return kardexentradaList;
    }

    public void setKardexentradaList(List<Kardexentrada> kardexentradaList) {
        this.kardexentradaList = kardexentradaList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (compradetallePK != null ? compradetallePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Compradetalle)) {
            return false;
        }
        Compradetalle other = (Compradetalle) object;
        if ((this.compradetallePK == null && other.compradetallePK != null) || (this.compradetallePK != null && !this.compradetallePK.equals(other.compradetallePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.inventario.entidades.Compradetalle[ compradetallePK=" + compradetallePK + " ]";
    }
    
}
