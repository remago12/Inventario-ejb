/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.inventario.entidades;

import java.io.Serializable;
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
@Table(name = "KARDEXSALIDA", catalog = "", schema = "INVENTARIO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Kardexsalida.findAll", query = "SELECT k FROM Kardexsalida k"),
    @NamedQuery(name = "Kardexsalida.findByKardexsalidaId", query = "SELECT k FROM Kardexsalida k WHERE k.kardexsalidaPK.kardexsalidaId = :kardexsalidaId"),
    @NamedQuery(name = "Kardexsalida.findByKardexId", query = "SELECT k FROM Kardexsalida k WHERE k.kardexsalidaPK.kardexId = :kardexId"),
    @NamedQuery(name = "Kardexsalida.findByDetalle", query = "SELECT k FROM Kardexsalida k WHERE k.detalle = :detalle"),
    @NamedQuery(name = "Kardexsalida.findByTiposalida", query = "SELECT k FROM Kardexsalida k WHERE k.tiposalida = :tiposalida")})
public class Kardexsalida implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected KardexsalidaPK kardexsalidaPK;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "DETALLE")
    private String detalle;
    @Basic(optional = false)
    @NotNull
    @Column(name = "TIPOSALIDA")
    private Character tiposalida;
    @JoinColumns({
        @JoinColumn(name = "KARDEX_ID", referencedColumnName = "KARDEX_ID", insertable = false, updatable = false),
        @JoinColumn(name = "PRODUCTO_ID", referencedColumnName = "PRODUCTO_ID")})
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Kardex kardex;
    @JoinColumns({
        @JoinColumn(name = "FACTURADETALLE_ID", referencedColumnName = "FACTURADETALLE_ID"),
        @JoinColumn(name = "FACTURA_ID", referencedColumnName = "FACTURA_ID")})
    @ManyToOne(fetch = FetchType.LAZY)
    private Facturadetalle facturadetalle;
    @JoinColumns({
        @JoinColumn(name = "AJUSTEDETALLE_ID", referencedColumnName = "AJUSTEDETALLE_ID"),
        @JoinColumn(name = "AJUSTE_ID", referencedColumnName = "AJUSTE_ID")})
    @ManyToOne(fetch = FetchType.LAZY)
    private Ajustedetalle ajustedetalle;

    public Kardexsalida() {
    }

    public Kardexsalida(KardexsalidaPK kardexsalidaPK) {
        this.kardexsalidaPK = kardexsalidaPK;
    }

    public Kardexsalida(KardexsalidaPK kardexsalidaPK, String detalle, Character tiposalida) {
        this.kardexsalidaPK = kardexsalidaPK;
        this.detalle = detalle;
        this.tiposalida = tiposalida;
    }

    public Kardexsalida(long kardexsalidaId, long kardexId) {
        this.kardexsalidaPK = new KardexsalidaPK(kardexsalidaId, kardexId);
    }

    public KardexsalidaPK getKardexsalidaPK() {
        return kardexsalidaPK;
    }

    public void setKardexsalidaPK(KardexsalidaPK kardexsalidaPK) {
        this.kardexsalidaPK = kardexsalidaPK;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public Character getTiposalida() {
        return tiposalida;
    }

    public void setTiposalida(Character tiposalida) {
        this.tiposalida = tiposalida;
    }

    public Kardex getKardex() {
        return kardex;
    }

    public void setKardex(Kardex kardex) {
        this.kardex = kardex;
    }

    public Facturadetalle getFacturadetalle() {
        return facturadetalle;
    }

    public void setFacturadetalle(Facturadetalle facturadetalle) {
        this.facturadetalle = facturadetalle;
    }

    public Ajustedetalle getAjustedetalle() {
        return ajustedetalle;
    }

    public void setAjustedetalle(Ajustedetalle ajustedetalle) {
        this.ajustedetalle = ajustedetalle;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (kardexsalidaPK != null ? kardexsalidaPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Kardexsalida)) {
            return false;
        }
        Kardexsalida other = (Kardexsalida) object;
        if ((this.kardexsalidaPK == null && other.kardexsalidaPK != null) || (this.kardexsalidaPK != null && !this.kardexsalidaPK.equals(other.kardexsalidaPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.inventario.entidades.Kardexsalida[ kardexsalidaPK=" + kardexsalidaPK + " ]";
    }
    
}
