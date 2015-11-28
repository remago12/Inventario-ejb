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
@Table(name = "CAJASALIDA", catalog = "", schema = "INVENTARIO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Cajasalida.findAll", query = "SELECT c FROM Cajasalida c"),
    @NamedQuery(name = "Cajasalida.findByCajasalidaId", query = "SELECT c FROM Cajasalida c WHERE c.cajasalidaPK.cajasalidaId = :cajasalidaId"),
    @NamedQuery(name = "Cajasalida.findBySucursalId", query = "SELECT c FROM Cajasalida c WHERE c.cajasalidaPK.sucursalId = :sucursalId"),
    @NamedQuery(name = "Cajasalida.findByFecha", query = "SELECT c FROM Cajasalida c WHERE c.cajasalidaPK.fecha = :fecha"),
    @NamedQuery(name = "Cajasalida.findByMonto", query = "SELECT c FROM Cajasalida c WHERE c.monto = :monto"),
    @NamedQuery(name = "Cajasalida.findByDescripcion", query = "SELECT c FROM Cajasalida c WHERE c.descripcion = :descripcion")})
public class Cajasalida implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected CajasalidaPK cajasalidaPK;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Column(name = "MONTO")
    private BigDecimal monto;
    @Size(max = 500)
    @Column(name = "DESCRIPCION")
    private String descripcion;
    @JoinColumn(name = "USUARIO_ID", referencedColumnName = "USUARIO_ID")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Usuario usuarioId;
    @JoinColumns({
        @JoinColumn(name = "SUCURSAL_ID", referencedColumnName = "SUCURSAL_ID", insertable = false, updatable = false),
        @JoinColumn(name = "FECHA", referencedColumnName = "FECHA", insertable = false, updatable = false)})
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Caja caja;

    public Cajasalida() {
    }

    public Cajasalida(CajasalidaPK cajasalidaPK) {
        this.cajasalidaPK = cajasalidaPK;
    }

    public Cajasalida(CajasalidaPK cajasalidaPK, BigDecimal monto) {
        this.cajasalidaPK = cajasalidaPK;
        this.monto = monto;
    }

    public Cajasalida(long cajasalidaId, long sucursalId, Date fecha) {
        this.cajasalidaPK = new CajasalidaPK(cajasalidaId, sucursalId, fecha);
    }

    public CajasalidaPK getCajasalidaPK() {
        return cajasalidaPK;
    }

    public void setCajasalidaPK(CajasalidaPK cajasalidaPK) {
        this.cajasalidaPK = cajasalidaPK;
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

    public Usuario getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(Usuario usuarioId) {
        this.usuarioId = usuarioId;
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
        hash += (cajasalidaPK != null ? cajasalidaPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cajasalida)) {
            return false;
        }
        Cajasalida other = (Cajasalida) object;
        if ((this.cajasalidaPK == null && other.cajasalidaPK != null) || (this.cajasalidaPK != null && !this.cajasalidaPK.equals(other.cajasalidaPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.inventario.entidades.Cajasalida[ cajasalidaPK=" + cajasalidaPK + " ]";
    }
    
}
