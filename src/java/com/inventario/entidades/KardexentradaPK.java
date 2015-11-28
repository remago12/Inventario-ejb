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
public class KardexentradaPK implements Serializable {
    @Basic(optional = false)
    @NotNull
    @Column(name = "KARDEXENTRADA_ID")
    private long kardexentradaId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "KARDEX_ID")
    private long kardexId;

    public KardexentradaPK() {
    }

    public KardexentradaPK(long kardexentradaId, long kardexId) {
        this.kardexentradaId = kardexentradaId;
        this.kardexId = kardexId;
    }

    public long getKardexentradaId() {
        return kardexentradaId;
    }

    public void setKardexentradaId(long kardexentradaId) {
        this.kardexentradaId = kardexentradaId;
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
        hash += (int) kardexentradaId;
        hash += (int) kardexId;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof KardexentradaPK)) {
            return false;
        }
        KardexentradaPK other = (KardexentradaPK) object;
        if (this.kardexentradaId != other.kardexentradaId) {
            return false;
        }
        if (this.kardexId != other.kardexId) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.inventario.entidades.KardexentradaPK[ kardexentradaId=" + kardexentradaId + ", kardexId=" + kardexId + " ]";
    }
    
}
