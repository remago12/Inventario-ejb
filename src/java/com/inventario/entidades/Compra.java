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
@Table(name = "COMPRA", catalog = "", schema = "INVENTARIO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Compra.findAll", query = "SELECT c FROM Compra c"),
    @NamedQuery(name = "Compra.findByCompraId", query = "SELECT c FROM Compra c WHERE c.compraId = :compraId"),
    @NamedQuery(name = "Compra.findByNumero", query = "SELECT c FROM Compra c WHERE c.numero = :numero"),
    @NamedQuery(name = "Compra.findByFecha", query = "SELECT c FROM Compra c WHERE c.fecha = :fecha"),
    @NamedQuery(name = "Compra.findByEstado", query = "SELECT c FROM Compra c WHERE c.estado = :estado"),
    @NamedQuery(name = "Compra.findByDescripcion", query = "SELECT c FROM Compra c WHERE c.descripcion = :descripcion")})
public class Compra implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "COMPRA_ID")
    private Long compraId;
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
    @JoinColumn(name = "USUARIO_ID", referencedColumnName = "USUARIO_ID")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Usuario usuarioId;
    @JoinColumn(name = "TIPOPAGO_ID", referencedColumnName = "TIPOPAGO_ID")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Tipopago tipopagoId;
    @JoinColumn(name = "TIPOFACTURA_ID", referencedColumnName = "TIPOFACTURA_ID")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Tipofactura tipofacturaId;
    @JoinColumn(name = "PROVEEDOR_ID", referencedColumnName = "PROVEEDOR_ID")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Proveedor proveedorId;
    @JoinColumn(name = "ORDENCOMPRA_ID", referencedColumnName = "ORDENCOMPRA_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Ordencompra ordencompraId;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "compra", fetch = FetchType.LAZY)
    private List<Compradetalle> compradetalleList;

    public Compra() {
    }

    public Compra(Long compraId) {
        this.compraId = compraId;
    }

    public Compra(Long compraId, String numero, Date fecha, Character estado) {
        this.compraId = compraId;
        this.numero = numero;
        this.fecha = fecha;
        this.estado = estado;
    }

    public Long getCompraId() {
        return compraId;
    }

    public void setCompraId(Long compraId) {
        this.compraId = compraId;
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

    public Proveedor getProveedorId() {
        return proveedorId;
    }

    public void setProveedorId(Proveedor proveedorId) {
        this.proveedorId = proveedorId;
    }

    public Ordencompra getOrdencompraId() {
        return ordencompraId;
    }

    public void setOrdencompraId(Ordencompra ordencompraId) {
        this.ordencompraId = ordencompraId;
    }

    @XmlTransient
    public List<Compradetalle> getCompradetalleList() {
        return compradetalleList;
    }

    public void setCompradetalleList(List<Compradetalle> compradetalleList) {
        this.compradetalleList = compradetalleList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (compraId != null ? compraId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Compra)) {
            return false;
        }
        Compra other = (Compra) object;
        if ((this.compraId == null && other.compraId != null) || (this.compraId != null && !this.compraId.equals(other.compraId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.inventario.entidades.Compra[ compraId=" + compraId + " ]";
    }
    
}
