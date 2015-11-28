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
public class OrdencompradetallePK implements Serializable {
    @Basic(optional = false)
    @NotNull
    @Column(name = "ORDENCOMPRADET_ID")
    private long ordencompradetId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ORDENCOMPRA_ID")
    private long ordencompraId;

    public OrdencompradetallePK() {
    }

    public OrdencompradetallePK(long ordencompradetId, long ordencompraId) {
        this.ordencompradetId = ordencompradetId;
        this.ordencompraId = ordencompraId;
    }

    public long getOrdencompradetId() {
        return ordencompradetId;
    }

    public void setOrdencompradetId(long ordencompradetId) {
        this.ordencompradetId = ordencompradetId;
    }

    public long getOrdencompraId() {
        return ordencompraId;
    }

    public void setOrdencompraId(long ordencompraId) {
        this.ordencompraId = ordencompraId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) ordencompradetId;
        hash += (int) ordencompraId;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OrdencompradetallePK)) {
            return false;
        }
        OrdencompradetallePK other = (OrdencompradetallePK) object;
        if (this.ordencompradetId != other.ordencompradetId) {
            return false;
        }
        if (this.ordencompraId != other.ordencompraId) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.inventario.entidades.OrdencompradetallePK[ ordencompradetId=" + ordencompradetId + ", ordencompraId=" + ordencompraId + " ]";
    }
    
}
