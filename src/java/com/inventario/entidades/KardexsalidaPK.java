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
public class KardexsalidaPK implements Serializable {
    @Basic(optional = false)
    @NotNull
    @Column(name = "KARDEXSALIDA_ID")
    private long kardexsalidaId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "KARDEX_ID")
    private long kardexId;

    public KardexsalidaPK() {
    }

    public KardexsalidaPK(long kardexsalidaId, long kardexId) {
        this.kardexsalidaId = kardexsalidaId;
        this.kardexId = kardexId;
    }

    public long getKardexsalidaId() {
        return kardexsalidaId;
    }

    public void setKardexsalidaId(long kardexsalidaId) {
        this.kardexsalidaId = kardexsalidaId;
    }

    public long getKardexId() {
        return kardexId;
    }

    public void setKardexId(long kardexId) {
        this.kardexId = kardexId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) kardexsalidaId;
        hash += (int) kardexId;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof KardexsalidaPK)) {
            return false;
        }
        KardexsalidaPK other = (KardexsalidaPK) object;
        if (this.kardexsalidaId != other.kardexsalidaId) {
            return false;
        }
        if (this.kardexId != other.kardexId) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.inventario.entidades.KardexsalidaPK[ kardexsalidaId=" + kardexsalidaId + ", kardexId=" + kardexId + " ]";
    }
    
}
