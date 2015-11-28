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
@Table(name = "NOTACREDITO", catalog = "", schema = "INVENTARIO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Notacredito.findAll", query = "SELECT n FROM Notacredito n"),
    @NamedQuery(name = "Notacredito.findByNotacreditoId", query = "SELECT n FROM Notacredito n WHERE n.notacreditoId = :notacreditoId"),
    @NamedQuery(name = "Notacredito.findByNumero", query = "SELECT n FROM Notacredito n WHERE n.numero = :numero"),
    @NamedQuery(name = "Notacredito.findByFecha", query = "SELECT n FROM Notacredito n WHERE n.fecha = :fecha"),
    @NamedQuery(name = "Notacredito.findByDescripcion", query = "SELECT n FROM Notacredito n WHERE n.descripcion = :descripcion")})
public class Notacredito implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "NOTACREDITO_ID")
    private Long notacreditoId;
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
    @Size(max = 500)
    @Column(name = "DESCRIPCION")
    private String descripcion;
    @JoinColumn(name = "USUARIO_ID", referencedColumnName = "USUARIO_ID")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Usuario usuarioId;
    @JoinColumn(name = "TIPONOTA_ID", referencedColumnName = "TIPONOTA_ID")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Tiponota tiponotaId;
    @JoinColumn(name = "FACTURA_ID", referencedColumnName = "FACTURA_ID")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Factura facturaId;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "notacredito", fetch = FetchType.LAZY)
    private List<Notacreditodetalle> notacreditodetalleList;

    public Notacredito() {
    }

    public Notacredito(Long notacreditoId) {
        this.notacreditoId = notacreditoId;
    }

    public Notacredito(Long notacreditoId, String numero, Date fecha) {
        this.notacreditoId = notacreditoId;
        this.numero = numero;
        this.fecha = fecha;
    }

    public Long getNotacreditoId() {
        return notacreditoId;
    }

    public void setNotacreditoId(Long notacreditoId) {
        this.notacreditoId = notacreditoId;
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

    public Tiponota getTiponotaId() {
        return tiponotaId;
    }

    public void setTiponotaId(Tiponota tiponotaId) {
        this.tiponotaId = tiponotaId;
    }

    public Factura getFacturaId() {
        return facturaId;
    }

    public void setFacturaId(Factura facturaId) {
        this.facturaId = facturaId;
    }

    @XmlTransient
    public List<Notacreditodetalle> getNotacreditodetalleList() {
        return notacreditodetalleList;
    }

    public void setNotacreditodetalleList(List<Notacreditodetalle> notacreditodetalleList) {
        this.notacreditodetalleList = notacreditodetalleList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (notacreditoId != null ? notacreditoId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Notacredito)) {
            return false;
        }
        Notacredito other = (Notacredito) object;
        if ((this.notacreditoId == null && other.notacreditoId != null) || (this.notacreditoId != null && !this.notacreditoId.equals(other.notacreditoId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.inventario.entidades.Notacredito[ notacreditoId=" + notacreditoId + " ]";
    }
    
}
