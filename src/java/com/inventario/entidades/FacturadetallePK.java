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
public class FacturadetallePK implements Serializable {
    @Basic(optional = false)
    @NotNull
    @Column(name = "FACTURADETALLE_ID")
    private long facturadetalleId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FACTURA_ID")
    private long facturaId;

    public FacturadetallePK() {
    }

    public FacturadetallePK(long facturadetalleId, long facturaId) {
        this.facturadetalleId = facturadetalleId;
        this.facturaId = facturaId;
    }

    public long getFacturadetalleId() {
        return facturadetalleId;
    }

    public void setFacturadetalleId(long facturadetalleId) {
        this.facturadetalleId = facturadetalleId;
    }

    public long getFacturaId() {
        return facturaId;
    }

    public void setFacturaId(long facturaId) {
        this.facturaId = facturaId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) facturadetalleId;
        hash += (int) facturaId;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof FacturadetallePK)) {
            return false;
        }
        FacturadetallePK other = (FacturadetallePK) object;
        if (this.facturadetalleId != other.facturadetalleId) {
            return false;
        }
        if (this.facturaId != other.facturaId) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.inventario.entidades.FacturadetallePK[ facturadetalleId=" + facturadetalleId + ", facturaId=" + facturaId + " ]";
    }
    
}
