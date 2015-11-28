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
public class AjustedetallePK implements Serializable {
    @Basic(optional = false)
    @NotNull
    @Column(name = "AJUSTEDETALLE_ID")
    private long ajustedetalleId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "AJUSTE_ID")
    private long ajusteId;

    public AjustedetallePK() {
    }

    public AjustedetallePK(long ajustedetalleId, long ajusteId) {
        this.ajustedetalleId = ajustedetalleId;
        this.ajusteId = ajusteId;
    }

    public long getAjustedetalleId() {
        return ajustedetalleId;
    }

    public void setAjustedetalleId(long ajustedetalleId) {
        this.ajustedetalleId = ajustedetalleId;
    }

    public long getAjusteId() {
        return ajusteId;
    }

    public void setAjusteId(long ajusteId) {
        this.ajusteId = ajusteId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) ajustedetalleId;
        hash += (int) ajusteId;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AjustedetallePK)) {
            return false;
        }
        AjustedetallePK other = (AjustedetallePK) object;
        if (this.ajustedetalleId != other.ajustedetalleId) {
            return false;
        }
        if (this.ajusteId != other.ajusteId) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.inventario.entidades.AjustedetallePK[ ajustedetalleId=" + ajustedetalleId + ", ajusteId=" + ajusteId + " ]";
    }
    
}
