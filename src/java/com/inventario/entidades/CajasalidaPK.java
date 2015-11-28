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
public class CajasalidaPK implements Serializable {
    @Basic(optional = false)
    @NotNull
    @Column(name = "CAJASALIDA_ID")
    private long cajasalidaId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "SUCURSAL_ID")
    private long sucursalId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FECHA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;

    public CajasalidaPK() {
    }

    public CajasalidaPK(long cajasalidaId, long sucursalId, Date fecha) {
        this.cajasalidaId = cajasalidaId;
        this.sucursalId = sucursalId;
        this.fecha = fecha;
    }

    public long getCajasalidaId() {
        return cajasalidaId;
    }

    public void setCajasalidaId(long cajasalidaId) {
        this.cajasalidaId = cajasalidaId;
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
        hash += (int) cajasalidaId;
        hash += (int) sucursalId;
        hash += (fecha != null ? fecha.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CajasalidaPK)) {
            return false;
        }
        CajasalidaPK other = (CajasalidaPK) object;
        if (this.cajasalidaId != other.cajasalidaId) {
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
        return "com.inventario.entidades.CajasalidaPK[ cajasalidaId=" + cajasalidaId + ", sucursalId=" + sucursalId + ", fecha=" + fecha + " ]";
    }
    
}
