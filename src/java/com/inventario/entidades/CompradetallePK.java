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
public class CompradetallePK implements Serializable {
    @Basic(optional = false)
    @NotNull
    @Column(name = "COMPRADETALLE_ID")
    private long compradetalleId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "COMPRA_ID")
    private long compraId;

    public CompradetallePK() {
    }

    public CompradetallePK(long compradetalleId, long compraId) {
        this.compradetalleId = compradetalleId;
        this.compraId = compraId;
    }

    public long getCompradetalleId() {
        return compradetalleId;
    }

    public void setCompradetalleId(long compradetalleId) {
        this.compradetalleId = compradetalleId;
    }

    public long getCompraId() {
        return compraId;
    }

    public void setCompraId(long compraId) {
        this.compraId = compraId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) compradetalleId;
        hash += (int) compraId;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CompradetallePK)) {
            return false;
        }
        CompradetallePK other = (CompradetallePK) object;
        if (this.compradetalleId != other.compradetalleId) {
            return false;
        }
        if (this.compraId != other.compraId) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.inventario.entidades.CompradetallePK[ compradetalleId=" + compradetalleId + ", compraId=" + compraId + " ]";
    }
    
}
