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
public class KardexPK implements Serializable {
    @Basic(optional = false)
    @NotNull
    @Column(name = "KARDEX_ID")
    private long kardexId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "PRODUCTO_ID")
    private long productoId;

    public KardexPK() {
    }

    public KardexPK(long kardexId, long productoId) {
        this.kardexId = kardexId;
        this.productoId = productoId;
    }

    public long getKardexId() {
        return kardexId;
    }

    public void setKardexId(long kardexId) {
        this.kardexId = kardexId;
    }

    public long getProductoId() {
        return productoId;
    }

    public void setProductoId(long productoId) {
        this.productoId = productoId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) kardexId;
        hash += (int) productoId;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof KardexPK)) {
            return false;
        }
        KardexPK other = (KardexPK) object;
        if (this.kardexId != other.kardexId) {
            return false;
        }
        if (this.productoId != other.productoId) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.inventario.entidades.KardexPK[ kardexId=" + kardexId + ", productoId=" + productoId + " ]";
    }
    
}
