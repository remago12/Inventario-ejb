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
@Table(name = "KARDEXENTRADA", catalog = "", schema = "INVENTARIO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Kardexentrada.findAll", query = "SELECT k FROM Kardexentrada k"),
    @NamedQuery(name = "Kardexentrada.findByKardexentradaId", query = "SELECT k FROM Kardexentrada k WHERE k.kardexentradaPK.kardexentradaId = :kardexentradaId"),
    @NamedQuery(name = "Kardexentrada.findByKardexId", query = "SELECT k FROM Kardexentrada k WHERE k.kardexentradaPK.kardexId = :kardexId"),
    @NamedQuery(name = "Kardexentrada.findByDetalle", query = "SELECT k FROM Kardexentrada k WHERE k.detalle = :detalle")})
public class Kardexentrada implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected KardexentradaPK kardexentradaPK;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "DETALLE")
    private String detalle;
    @JoinColumns({
        @JoinColumn(name = "KARDEX_ID", referencedColumnName = "KARDEX_ID", insertable = false, updatable = false),
        @JoinColumn(name = "PRODUCTO_ID", referencedColumnName = "PRODUCTO_ID")})
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Kardex kardex;
    @JoinColumns({
        @JoinColumn(name = "COMPRADETALLE_ID", referencedColumnName = "COMPRADETALLE_ID"),
        @JoinColumn(name = "COMPRA_ID", referencedColumnName = "COMPRA_ID")})
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Compradetalle compradetalle;

    public Kardexentrada() {
    }

    public Kardexentrada(KardexentradaPK kardexentradaPK) {
        this.kardexentradaPK = kardexentradaPK;
    }

    public Kardexentrada(KardexentradaPK kardexentradaPK, String detalle) {
        this.kardexentradaPK = kardexentradaPK;
        this.detalle = detalle;
    }

    public Kardexentrada(long kardexentradaId, long kardexId) {
        this.kardexentradaPK = new KardexentradaPK(kardexentradaId, kardexId);
    }

    public KardexentradaPK getKardexentradaPK() {
        return kardexentradaPK;
    }

    public void setKardexentradaPK(KardexentradaPK kardexentradaPK) {
        this.kardexentradaPK = kardexentradaPK;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public Kardex getKardex() {
        return kardex;
    }

    public void setKardex(Kardex kardex) {
        this.kardex = kardex;
    }

    public Compradetalle getCompradetalle() {
        return compradetalle;
    }

    public void setCompradetalle(Compradetalle compradetalle) {
        this.compradetalle = compradetalle;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (kardexentradaPK != null ? kardexentradaPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Kardexentrada)) {
            return false;
        }
        Kardexentrada other = (Kardexentrada) object;
        if ((this.kardexentradaPK == null && other.kardexentradaPK != null) || (this.kardexentradaPK != null && !this.kardexentradaPK.equals(other.kardexentradaPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.inventario.entidades.Kardexentrada[ kardexentradaPK=" + kardexentradaPK + " ]";
    }
    
}
