/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.inventario.entidades;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Rene Gomez
 */
@Entity
@Table(name = "CAJAENTRADA", catalog = "", schema = "INVENTARIO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Cajaentrada.findAll", query = "SELECT c FROM Cajaentrada c"),
    @NamedQuery(name = "Cajaentrada.findByCajaentradaId", query = "SELECT c FROM Cajaentrada c WHERE c.cajaentradaPK.cajaentradaId = :cajaentradaId"),
    @NamedQuery(name = "Cajaentrada.findBySucursalId", query = "SELECT c FROM Cajaentrada c WHERE c.cajaentradaPK.sucursalId = :sucursalId"),
    @NamedQuery(name = "Cajaentrada.findByFecha", query = "SELECT c FROM Cajaentrada c WHERE c.cajaentradaPK.fecha = :fecha"),
    @NamedQuery(name = "Cajaentrada.findByMonto", query = "SELECT c FROM Cajaentrada c WHERE c.monto = :monto"),
    @NamedQuery(name = "Cajaentrada.findByDescripcion", query = "SELECT c FROM Cajaentrada c WHERE c.descripcion = :descripcion")})
public class Cajaentrada implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected CajaentradaPK cajaentradaPK;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Column(name = "MONTO")
    private BigDecimal monto;
    @Size(max = 500)
    @Column(name = "DESCRIPCION")
    private String descripcion;
    @JoinColumn(name = "FACTURA_ID", referencedColumnName = "FACTURA_ID")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Factura facturaId;
    @JoinColumns({
        @JoinColumn(name = "SUCURSAL_ID", referencedColumnName = "SUCURSAL_ID", insertable = false, updatable = false),
        @JoinColumn(name = "FECHA", referencedColumnName = "FECHA", insertable = false, updatable = false)})
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Caja caja;

    public Cajaentrada() {
    }

    public Cajaentrada(CajaentradaPK cajaentradaPK) {
        this.cajaentradaPK = cajaentradaPK;
    }

    public Cajaentrada(CajaentradaPK cajaentradaPK, BigDecimal monto) {
        this.cajaentradaPK = cajaentradaPK;
        this.monto = monto;
    }

    public Cajaentrada(long cajaentradaId, long sucursalId, Date fecha) {
        this.cajaentradaPK = new CajaentradaPK(cajaentradaId, sucursalId, fecha);
    }

    public CajaentradaPK getCajaentradaPK() {
        return cajaentradaPK;
    }

    public void setCajaentradaPK(CajaentradaPK cajaentradaPK) {
        this.cajaentradaPK = cajaentradaPK;
    }

    public BigDecimal getMonto() {
        return monto;
    }

    public void setMonto(BigDecimal monto) {
        this.monto = monto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Factura getFacturaId() {
        return facturaId;
    }

    public void setFacturaId(Factura facturaId) {
        this.facturaId = facturaId;
    }

    public Caja getCaja() {
        return caja;
    }

    public void setCaja(Caja caja) {
        this.caja = caja;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cajaentradaPK != null ? cajaentradaPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cajaentrada)) {
            return false;
        }
        Cajaentrada other = (Cajaentrada) object;
        if ((this.cajaentradaPK == null && other.cajaentradaPK != null) || (this.cajaentradaPK != null && !this.cajaentradaPK.equals(other.cajaentradaPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.inventario.entidades.Cajaentrada[ cajaentradaPK=" + cajaentradaPK + " ]";
    }
    
}
