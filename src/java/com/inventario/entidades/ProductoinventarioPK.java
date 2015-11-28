/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.inventario.entidades;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;

/**
 *
 * @author Rene Gomez
 */
@Embeddable
public class ProductoinventarioPK implements Serializable {
    @Basic(optional = false)
    @NotNull
    @Column(name = "PRODUCTO_ID")
    private long productoId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "SECCION_ID")
    private long seccionId;

    public ProductoinventarioPK() {
    }

    public ProductoinventarioPK(long productoId, long seccionId) {
        this.productoId = productoId;
        this.seccionId = seccionId;
    }

    public long getProductoId() {
        return productoId;
    }

    public void setProductoId(long productoId) {
        this.productoId = productoId;
    }

    public long getSeccionId() {
        return seccionId;
    }

    public void setSeccionId(long seccionId) {
        this.seccionId = seccionId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) productoId;
        hash += (int) seccionId;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProductoinventarioPK)) {
            return false;
        }
        ProductoinventarioPK other = (ProductoinventarioPK) object;
        if (this.productoId != other.productoId) {
            return false;
        }
        if (this.seccionId != other.seccionId) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.inventario.entidades.ProductoinventarioPK[ productoId=" + productoId + ", seccionId=" + seccionId + " ]";
    }
    
}
