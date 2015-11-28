/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.inventario.entidades;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

/**
 *
 * @author Rene Gomez
 */
@Embeddable
public class ProductohistPK implements Serializable {
    @Basic(optional = false)
    @NotNull
    @Column(name = "PRODUCTO_ID")
    private long productoId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FECHAINICIO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechainicio;

    public ProductohistPK() {
    }

    public ProductohistPK(long productoId, Date fechainicio) {
        this.productoId = productoId;
        this.fechainicio = fechainicio;
    }

    public long getProductoId() {
        return productoId;
    }

    public void setProductoId(long productoId) {
        this.productoId = productoId;
    }

    public Date getFechainicio() {
        return fechainicio;
    }

    public void setFechainicio(Date fechainicio) {
        this.fechainicio = fechainicio;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) productoId;
        hash += (fechainicio != null ? fechainicio.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProductohistPK)) {
            return false;
        }
        ProductohistPK other = (ProductohistPK) object;
        if (this.productoId != other.productoId) {
            return false;
        }
        if ((this.fechainicio == null && other.fechainicio != null) || (this.fechainicio != null && !this.fechainicio.equals(other.fechainicio))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.inventario.entidades.ProductohistPK[ productoId=" + productoId + ", fechainicio=" + fechainicio + " ]";
    }
    
}
