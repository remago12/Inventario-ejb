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
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Rene Gomez
 */
@Entity
@Table(name = "PRODUCTOHIST", catalog = "", schema = "INVENTARIO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Productohist.findAll", query = "SELECT p FROM Productohist p"),
    @NamedQuery(name = "Productohist.findByProductoId", query = "SELECT p FROM Productohist p WHERE p.productohistPK.productoId = :productoId"),
    @NamedQuery(name = "Productohist.findByFechainicio", query = "SELECT p FROM Productohist p WHERE p.productohistPK.fechainicio = :fechainicio"),
    @NamedQuery(name = "Productohist.findByFechafin", query = "SELECT p FROM Productohist p WHERE p.fechafin = :fechafin"),
    @NamedQuery(name = "Productohist.findByValor", query = "SELECT p FROM Productohist p WHERE p.valor = :valor"),
    @NamedQuery(name = "Productohist.findByFechamod", query = "SELECT p FROM Productohist p WHERE p.fechamod = :fechamod"),
    @NamedQuery(name = "Productohist.findByCambio", query = "SELECT p FROM Productohist p WHERE p.cambio = :cambio")})
public class Productohist implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ProductohistPK productohistPK;
    @Column(name = "FECHAFIN")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechafin;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Column(name = "VALOR")
    private BigDecimal valor;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FECHAMOD")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechamod;
    @Basic(optional = false)
    @NotNull
    @Column(name = "CAMBIO")
    private Character cambio;
    @JoinColumn(name = "PRODUCTO_ID", referencedColumnName = "PRODUCTO_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Producto producto;

    public Productohist() {
    }

    public Productohist(ProductohistPK productohistPK) {
        this.productohistPK = productohistPK;
    }

    public Productohist(ProductohistPK productohistPK, BigDecimal valor, Date fechamod, Character cambio) {
        this.productohistPK = productohistPK;
        this.valor = valor;
        this.fechamod = fechamod;
        this.cambio = cambio;
    }

    public Productohist(long productoId, Date fechainicio) {
        this.productohistPK = new ProductohistPK(productoId, fechainicio);
    }

    public ProductohistPK getProductohistPK() {
        return productohistPK;
    }

    public void setProductohistPK(ProductohistPK productohistPK) {
        this.productohistPK = productohistPK;
    }

    public Date getFechafin() {
        return fechafin;
    }

    public void setFechafin(Date fechafin) {
        this.fechafin = fechafin;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public Date getFechamod() {
        return fechamod;
    }

    public void setFechamod(Date fechamod) {
        this.fechamod = fechamod;
    }

    public Character getCambio() {
        return cambio;
    }

    public void setCambio(Character cambio) {
        this.cambio = cambio;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (productohistPK != null ? productohistPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Productohist)) {
            return false;
        }
        Productohist other = (Productohist) object;
        if ((this.productohistPK == null && other.productohistPK != null) || (this.productohistPK != null && !this.productohistPK.equals(other.productohistPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.inventario.entidades.Productohist[ productohistPK=" + productohistPK + " ]";
    }
    
}
