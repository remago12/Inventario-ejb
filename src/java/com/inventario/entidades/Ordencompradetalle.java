/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.inventario.entidades;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Rene Gomez
 */
@Entity
@Table(name = "ORDENCOMPRADETALLE", catalog = "", schema = "INVENTARIO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Ordencompradetalle.findAll", query = "SELECT o FROM Ordencompradetalle o"),
    @NamedQuery(name = "Ordencompradetalle.findByOrdencompradetId", query = "SELECT o FROM Ordencompradetalle o WHERE o.ordencompradetallePK.ordencompradetId = :ordencompradetId"),
    @NamedQuery(name = "Ordencompradetalle.findByOrdencompraId", query = "SELECT o FROM Ordencompradetalle o WHERE o.ordencompradetallePK.ordencompraId = :ordencompraId"),
    @NamedQuery(name = "Ordencompradetalle.findByCantidadreq", query = "SELECT o FROM Ordencompradetalle o WHERE o.cantidadreq = :cantidadreq"),
    @NamedQuery(name = "Ordencompradetalle.findByPreciounidad", query = "SELECT o FROM Ordencompradetalle o WHERE o.preciounidad = :preciounidad"),
    @NamedQuery(name = "Ordencompradetalle.findByFechacad", query = "SELECT o FROM Ordencompradetalle o WHERE o.fechacad = :fechacad"),
    @NamedQuery(name = "Ordencompradetalle.findByObservacion", query = "SELECT o FROM Ordencompradetalle o WHERE o.observacion = :observacion")})
public class Ordencompradetalle implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected OrdencompradetallePK ordencompradetallePK;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Column(name = "CANTIDADREQ")
    private BigDecimal cantidadreq;
    @Basic(optional = false)
    @NotNull
    @Column(name = "PRECIOUNIDAD")
    private BigDecimal preciounidad;
    @Column(name = "FECHACAD")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechacad;
    @Size(max = 500)
    @Column(name = "OBSERVACION")
    private String observacion;
    @JoinColumn(name = "PRODUCTO_ID", referencedColumnName = "PRODUCTO_ID")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Producto productoId;
    @JoinColumn(name = "ORDENCOMPRA_ID", referencedColumnName = "ORDENCOMPRA_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Ordencompra ordencompra;

    public Ordencompradetalle() {
    }

    public Ordencompradetalle(OrdencompradetallePK ordencompradetallePK) {
        this.ordencompradetallePK = ordencompradetallePK;
    }

    public Ordencompradetalle(OrdencompradetallePK ordencompradetallePK, BigDecimal cantidadreq, BigDecimal preciounidad) {
        this.ordencompradetallePK = ordencompradetallePK;
        this.cantidadreq = cantidadreq;
        this.preciounidad = preciounidad;
    }

    public Ordencompradetalle(long ordencompradetId, long ordencompraId) {
        this.ordencompradetallePK = new OrdencompradetallePK(ordencompradetId, ordencompraId);
    }

    public OrdencompradetallePK getOrdencompradetallePK() {
        return ordencompradetallePK;
    }

    public void setOrdencompradetallePK(OrdencompradetallePK ordencompradetallePK) {
        this.ordencompradetallePK = ordencompradetallePK;
    }

    public BigDecimal getCantidadreq() {
        return cantidadreq;
    }

    public void setCantidadreq(BigDecimal cantidadreq) {
        this.cantidadreq = cantidadreq;
    }

    public BigDecimal getPreciounidad() {
        return preciounidad;
    }

    public void setPreciounidad(BigDecimal preciounidad) {
        this.preciounidad = preciounidad;
    }

    public Date getFechacad() {
        return fechacad;
    }

    public void setFechacad(Date fechacad) {
        this.fechacad = fechacad;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public Producto getProductoId() {
        return productoId;
    }

    public void setProductoId(Producto productoId) {
        this.productoId = productoId;
    }

    public Ordencompra getOrdencompra() {
        return ordencompra;
    }

    public void setOrdencompra(Ordencompra ordencompra) {
        this.ordencompra = ordencompra;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (ordencompradetallePK != null ? ordencompradetallePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Ordencompradetalle)) {
            return false;
        }
        Ordencompradetalle other = (Ordencompradetalle) object;
        if ((this.ordencompradetallePK == null && other.ordencompradetallePK != null) || (this.ordencompradetallePK != null && !this.ordencompradetallePK.equals(other.ordencompradetallePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.inventario.entidades.Ordencompradetalle[ ordencompradetallePK=" + ordencompradetallePK + " ]";
    }
    
}
