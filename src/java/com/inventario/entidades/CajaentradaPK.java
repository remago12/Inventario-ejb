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
public class CajaentradaPK implements Serializable {
    @Basic(optional = false)
    @NotNull
    @Column(name = "CAJAENTRADA_ID")
    private long cajaentradaId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "SUCURSAL_ID")
    private long sucursalId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FECHA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;

    public CajaentradaPK() {
    }

    public CajaentradaPK(long cajaentradaId, long sucursalId, Date fecha) {
        this.cajaentradaId = cajaentradaId;
        this.sucursalId = sucursalId;
        this.fecha = fecha;
    }

    public long getCajaentradaId() {
        return cajaentradaId;
    }

    public void setCajaentradaId(long cajaentradaId) {
        this.cajaentradaId = cajaentradaId;
    }

    public long getSucursalId() {
        return sucursalId;
    }

    public void setSucursalId(long sucursalId) {
        this.sucursalId = sucursalId;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) cajaentradaId;
        hash += (int) sucursalId;
        hash += (fecha != null ? fecha.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CajaentradaPK)) {
            return false;
        }
        CajaentradaPK other = (CajaentradaPK) object;
        if (this.cajaentradaId != other.cajaentradaId) {
            return false;
        }
        if (this.sucursalId != other.sucursalId) {
            return false;
        }
        if ((this.fecha == null && other.fecha != null) || (this.fecha != null && !this.fecha.equals(other.fecha))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.inventario.entidades.CajaentradaPK[ cajaentradaId=" + cajaentradaId + ", sucursalId=" + sucursalId + ", fecha=" + fecha + " ]";
    }
    
}
