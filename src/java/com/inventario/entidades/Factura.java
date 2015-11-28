/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.inventario.entidades;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Rene Gomez
 */
@Entity
@Table(name = "FACTURA", catalog = "", schema = "INVENTARIO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Factura.findAll", query = "SELECT f FROM Factura f"),
    @NamedQuery(name = "Factura.findByFacturaId", query = "SELECT f FROM Factura f WHERE f.facturaId = :facturaId"),
    @NamedQuery(name = "Factura.findByNumero", query = "SELECT f FROM Factura f WHERE f.numero = :numero"),
    @NamedQuery(name = "Factura.findByFecha", query = "SELECT f FROM Factura f WHERE f.fecha = :fecha"),
    @NamedQuery(name = "Factura.findByEstado", query = "SELECT f FROM Factura f WHERE f.estado = :estado"),
    @NamedQuery(name = "Factura.findByDescripcion", query = "SELECT f FROM Factura f WHERE f.descripcion = :descripcion")})
public class Factura implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "FACTURA_ID")
    private Long facturaId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 25)
    @Column(name = "NUMERO")
    private String numero;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FECHA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ESTADO")
    private Character estado;
    @Size(max = 500)
    @Column(name = "DESCRIPCION")
    private String descripcion;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "factura", fetch = FetchType.LAZY)
    private List<Facturadetalle> facturadetalleList;
    @JoinColumn(name = "USUARIO_ID", referencedColumnName = "USUARIO_ID")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Usuario usuarioId;
    @JoinColumn(name = "TIPOPAGO_ID", referencedColumnName = "TIPOPAGO_ID")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Tipopago tipopagoId;
    @JoinColumn(name = "TIPOFACTURA_ID", referencedColumnName = "TIPOFACTURA_ID")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Tipofactura tipofacturaId;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "facturaId", fetch = FetchType.LAZY)
    private List<Notacredito> notacreditoList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "facturaId", fetch = FetchType.LAZY)
    private List<Cajaentrada> cajaentradaList;

    public Factura() {
    }

    public Factura(Long facturaId) {
        this.facturaId = facturaId;
    }

    public Factura(Long facturaId, String numero, Date fecha, Character estado) {
        this.facturaId = facturaId;
        this.numero = numero;
        this.fecha = fecha;
        this.estado = estado;
    }

    public Long getFacturaId() {
        return facturaId;
    }

    public void setFacturaId(Long facturaId) {
        this.facturaId = facturaId;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Character getEstado() {
        return estado;
    }

    public void setEstado(Character estado) {
        this.estado = estado;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @XmlTransient
    public List<Facturadetalle> getFacturadetalleList() {
        return facturadetalleList;
    }

    public void setFacturadetalleList(List<Facturadetalle> facturadetalleList) {
        this.facturadetalleList = facturadetalleList;
    }

    public Usuario getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(Usuario usuarioId) {
        this.usuarioId = usuarioId;
    }

    public Tipopago getTipopagoId() {
        return tipopagoId;
    }

    public void setTipopagoId(Tipopago tipopagoId) {
        this.tipopagoId = tipopagoId;
    }

    public Tipofactura getTipofacturaId() {
        return tipofacturaId;
    }

    public void setTipofacturaId(Tipofactura tipofacturaId) {
        this.tipofacturaId = tipofacturaId;
    }

    @XmlTransient
    public List<Notacredito> getNotacreditoList() {
        return notacreditoList;
    }

    public void setNotacreditoList(List<Notacredito> notacreditoList) {
        this.notacreditoList = notacreditoList;
    }

    @XmlTransient
    public List<Cajaentrada> getCajaentradaList() {
        return cajaentradaList;
    }

    public void setCajaentradaList(List<Cajaentrada> cajaentradaList) {
        this.cajaentradaList = cajaentradaList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (facturaId != null ? facturaId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Factura)) {
            return false;
        }
        Factura other = (Factura) object;
        if ((this.facturaId == null && other.facturaId != null) || (this.facturaId != null && !this.facturaId.equals(other.facturaId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.inventario.entidades.Factura[ facturaId=" + facturaId + " ]";
    }
    
}
