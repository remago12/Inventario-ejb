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
public class NotacreditodetallePK implements Serializable {
    @Basic(optional = false)
    @NotNull
    @Column(name = "NOTACREDITODET_ID")
    private long notacreditodetId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "NOTACREDITO_ID")
    private long notacreditoId;

    public NotacreditodetallePK() {
    }

    public NotacreditodetallePK(long notacreditodetId, long notacreditoId) {
        this.notacreditodetId = notacreditodetId;
        this.notacreditoId = notacreditoId;
    }

    public long getNotacreditodetId() {
        return notacreditodetId;
    }

    public void setNotacreditodetId(long notacreditodetId) {
        this.notacreditodetId = notacreditodetId;
    }

    public long getNotacreditoId() {
        return notacreditoId;
    }

    public void setNotacreditoId(long notacreditoId) {
        this.notacreditoId = notacreditoId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) notacreditodetId;
        hash += (int) notacreditoId;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof NotacreditodetallePK)) {
            return false;
        }
        NotacreditodetallePK other = (NotacreditodetallePK) object;
        if (this.notacreditodetId != other.notacreditodetId) {
            return false;
        }
        if (this.notacreditoId != other.notacreditoId) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.inventario.entidades.NotacreditodetallePK[ notacreditodetId=" + notacreditodetId + ", notacreditoId=" + notacreditoId + " ]";
    }
    
}
