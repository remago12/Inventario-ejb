/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.inventario.entidades;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Rene Gomez
 */
@Entity
@Table(name = "NOTACREDITODETALLE", catalog = "", schema = "INVENTARIO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Notacreditodetalle.findAll", query = "SELECT n FROM Notacreditodetalle n"),
    @NamedQuery(name = "Notacreditodetalle.findByNotacreditodetId", query = "SELECT n FROM Notacreditodetalle n WHERE n.notacreditodetallePK.notacreditodetId = :notacreditodetId"),
    @NamedQuery(name = "Notacreditodetalle.findByNotacreditoId", query = "SELECT n FROM Notacreditodetalle n WHERE n.notacreditodetallePK.notacreditoId = :notacreditoId"),
    @NamedQuery(name = "Notacreditodetalle.findByCantidad", query = "SELECT n FROM Notacreditodetalle n WHERE n.cantidad = :cantidad"),
    @NamedQuery(name = "Notacreditodetalle.findByPreciounidad", query = "SELECT n FROM Notacreditodetalle n WHERE n.preciounidad = :preciounidad")})
public class Notacreditodetalle implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected NotacreditodetallePK notacreditodetallePK;
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
    @JoinColumn(name = "NOTACREDITO_ID", referencedColumnName = "NOTACREDITO_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Notacredito notacredito;

    public Notacreditodetalle() {
    }

    public Notacreditodetalle(NotacreditodetallePK notacreditodetallePK) {
        this.notacreditodetallePK = notacreditodetallePK;
    }

    public Notacreditodetalle(NotacreditodetallePK notacreditodetallePK, BigDecimal cantidad, BigDecimal preciounidad) {
        this.notacreditodetallePK = notacreditodetallePK;
        this.cantidad = cantidad;
        this.preciounidad = preciounidad;
    }

    public Notacreditodetalle(long notacreditodetId, long notacreditoId) {
        this.notacreditodetallePK = new NotacreditodetallePK(notacreditodetId, notacreditoId);
    }

    public NotacreditodetallePK getNotacreditodetallePK() {
        return notacreditodetallePK;
    }

    public void setNotacreditodetallePK(NotacreditodetallePK notacreditodetallePK) {
        this.notacreditodetallePK = notacreditodetallePK;
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

    public Notacredito getNotacredito() {
        return notacredito;
    }

    public void setNotacredito(Notacredito notacredito) {
        this.notacredito = notacredito;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (notacreditodetallePK != null ? notacreditodetallePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Notacreditodetalle)) {
            return false;
        }
        Notacreditodetalle other = (Notacreditodetalle) object;
        if ((this.notacreditodetallePK == null && other.notacreditodetallePK != null) || (this.notacreditodetallePK != null && !this.notacreditodetallePK.equals(other.notacreditodetallePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.inventario.entidades.Notacreditodetalle[ notacreditodetallePK=" + notacreditodetallePK + " ]";
    }
    
}
