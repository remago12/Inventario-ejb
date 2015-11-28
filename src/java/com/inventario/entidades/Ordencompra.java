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
@Table(name = "ORDENCOMPRA", catalog = "", schema = "INVENTARIO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Ordencompra.findAll", query = "SELECT o FROM Ordencompra o"),
    @NamedQuery(name = "Ordencompra.findByOrdencompraId", query = "SELECT o FROM Ordencompra o WHERE o.ordencompraId = :ordencompraId"),
    @NamedQuery(name = "Ordencompra.findByNumero", query = "SELECT o FROM Ordencompra o WHERE o.numero = :numero"),
    @NamedQuery(name = "Ordencompra.findByFechaorden", query = "SELECT o FROM Ordencompra o WHERE o.fechaorden = :fechaorden"),
    @NamedQuery(name = "Ordencompra.findByFecharevision", query = "SELECT o FROM Ordencompra o WHERE o.fecharevision = :fecharevision"),
    @NamedQuery(name = "Ordencompra.findByEstado", query = "SELECT o FROM Ordencompra o WHERE o.estado = :estado"),
    @NamedQuery(name = "Ordencompra.findByDescripcion", query = "SELECT o FROM Ordencompra o WHERE o.descripcion = :descripcion")})
public class Ordencompra implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ORDENCOMPRA_ID")
    private Long ordencompraId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 25)
    @Column(name = "NUMERO")
    private String numero;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FECHAORDEN")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaorden;
    @Column(name = "FECHAREVISION")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecharevision;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ESTADO")
    private Character estado;
    @Size(max = 500)
    @Column(name = "DESCRIPCION")
    private String descripcion;
    @OneToMany(mappedBy = "ordencompraId", fetch = FetchType.LAZY)
    private List<Compra> compraList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "ordencompra", fetch = FetchType.LAZY)
    private List<Ordencompradetalle> ordencompradetalleList;
    @JoinColumn(name = "USUARIO_ID", referencedColumnName = "USUARIO_ID")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Usuario usuarioId;
    @JoinColumn(name = "PROVEEDOR_ID", referencedColumnName = "PROVEEDOR_ID")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Proveedor proveedorId;

    public Ordencompra() {
    }

    public Ordencompra(Long ordencompraId) {
        this.ordencompraId = ordencompraId;
    }

    public Ordencompra(Long ordencompraId, String numero, Date fechaorden, Character estado) {
        this.ordencompraId = ordencompraId;
        this.numero = numero;
        this.fechaorden = fechaorden;
        this.estado = estado;
    }

    public Long getOrdencompraId() {
        return ordencompraId;
    }

    public void setOrdencompraId(Long ordencompraId) {
        this.ordencompraId = ordencompraId;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Date getFechaorden() {
        return fechaorden;
    }

    public void setFechaorden(Date fechaorden) {
        this.fechaorden = fechaorden;
    }

    public Date getFecharevision() {
        return fecharevision;
    }

    public void setFecharevision(Date fecharevision) {
        this.fecharevision = fecharevision;
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
    public List<Compra> getCompraList() {
        return compraList;
    }

    public void setCompraList(List<Compra> compraList) {
        this.compraList = compraList;
    }

    @XmlTransient
    public List<Ordencompradetalle> getOrdencompradetalleList() {
        return ordencompradetalleList;
    }

    public void setOrdencompradetalleList(List<Ordencompradetalle> ordencompradetalleList) {
        this.ordencompradetalleList = ordencompradetalleList;
    }

    public Usuario getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(Usuario usuarioId) {
        this.usuarioId = usuarioId;
    }

    public Proveedor getProveedorId() {
        return proveedorId;
    }

    public void setProveedorId(Proveedor proveedorId) {
        this.proveedorId = proveedorId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (ordencompraId != null ? ordencompraId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Ordencompra)) {
            return false;
        }
        Ordencompra other = (Ordencompra) object;
        if ((this.ordencompraId == null && other.ordencompraId != null) || (this.ordencompraId != null && !this.ordencompraId.equals(other.ordencompraId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.inventario.entidades.Ordencompra[ ordencompraId=" + ordencompraId + " ]";
    }
    
}
