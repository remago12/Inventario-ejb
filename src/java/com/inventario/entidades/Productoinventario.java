/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.inventario.entidades;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Rene Gomez
 */
@Entity
@Table(name = "PRODUCTOINVENTARIO", catalog = "", schema = "INVENTARIO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Productoinventario.findAll", query = "SELECT p FROM Productoinventario p"),
    @NamedQuery(name = "Productoinventario.findByProductoId", query = "SELECT p FROM Productoinventario p WHERE p.productoinventarioPK.productoId = :productoId"),
    @NamedQuery(name = "Productoinventario.findBySeccionId", query = "SELECT p FROM Productoinventario p WHERE p.productoinventarioPK.seccionId = :seccionId"),
    @NamedQuery(name = "Productoinventario.findByCantidad", query = "SELECT p FROM Productoinventario p WHERE p.cantidad = :cantidad"),
    @NamedQuery(name = "Productoinventario.findByFechamod", query = "SELECT p FROM Productoinventario p WHERE p.fechamod = :fechamod")})
public class Productoinventario implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ProductoinventarioPK productoinventarioPK;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Column(name = "CANTIDAD")
    private BigDecimal cantidad;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FECHAMOD")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechamod;
    @JoinColumn(name = "SECCION_ID", referencedColumnName = "SECCION_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Seccion seccion;
    @JoinColumn(name = "PRODUCTO_ID", referencedColumnName = "PRODUCTO_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Producto producto;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "productoinventario", fetch = FetchType.LAZY)
    private List<Ajustedetalle> ajustedetalleList;

    public Productoinventario() {
    }

    public Productoinventario(ProductoinventarioPK productoinventarioPK) {
        this.productoinventarioPK = productoinventarioPK;
    }

    public Productoinventario(ProductoinventarioPK productoinventarioPK, BigDecimal cantidad, Date fechamod) {
        this.productoinventarioPK = productoinventarioPK;
        this.cantidad = cantidad;
        this.fechamod = fechamod;
    }

    public Productoinventario(long productoId, long seccionId) {
        this.productoinventarioPK = new ProductoinventarioPK(productoId, seccionId);
    }

    public ProductoinventarioPK getProductoinventarioPK() {
        return productoinventarioPK;
    }

    public void setProductoinventarioPK(ProductoinventarioPK productoinventarioPK) {
        this.productoinventarioPK = productoinventarioPK;
    }

    public BigDecimal getCantidad() {
        return cantidad;
    }

    public void setCantidad(BigDecimal cantidad) {
        this.cantidad = cantidad;
    }

    public Date getFechamod() {
        return fechamod;
    }

    public void setFechamod(Date fechamod) {
        this.fechamod = fechamod;
    }

    public Seccion getSeccion() {
        return seccion;
    }

    public void setSeccion(Seccion seccion) {
        this.seccion = seccion;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    @XmlTransient
    public List<Ajustedetalle> getAjustedetalleList() {
        return ajustedetalleList;
    }

    public void setAjustedetalleList(List<Ajustedetalle> ajustedetalleList) {
        this.ajustedetalleList = ajustedetalleList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (productoinventarioPK != null ? productoinventarioPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Productoinventario)) {
            return false;
        }
        Productoinventario other = (Productoinventario) object;
        if ((this.productoinventarioPK == null && other.productoinventarioPK != null) || (this.productoinventarioPK != null && !this.productoinventarioPK.equals(other.productoinventarioPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.inventario.entidades.Productoinventario[ productoinventarioPK=" + productoinventarioPK + " ]";
    }
    
}
