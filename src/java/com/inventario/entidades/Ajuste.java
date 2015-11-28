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
@Table(name = "AJUSTE", catalog = "", schema = "INVENTARIO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Ajuste.findAll", query = "SELECT a FROM Ajuste a"),
    @NamedQuery(name = "Ajuste.findByAjusteId", query = "SELECT a FROM Ajuste a WHERE a.ajusteId = :ajusteId"),
    @NamedQuery(name = "Ajuste.findByTipo", query = "SELECT a FROM Ajuste a WHERE a.tipo = :tipo"),
    @NamedQuery(name = "Ajuste.findByFecha", query = "SELECT a FROM Ajuste a WHERE a.fecha = :fecha"),
    @NamedQuery(name = "Ajuste.findByDescripcion", query = "SELECT a FROM Ajuste a WHERE a.descripcion = :descripcion")})
public class Ajuste implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "AJUSTE_ID")
    private Long ajusteId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 25)
    @Column(name = "TIPO")
    private String tipo;
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
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "ajuste", fetch = FetchType.LAZY)
    private List<Ajustedetalle> ajustedetalleList;

    public Ajuste() {
    }

    public Ajuste(Long ajusteId) {
        this.ajusteId = ajusteId;
    }

    public Ajuste(Long ajusteId, String tipo, Date fecha) {
        this.ajusteId = ajusteId;
        this.tipo = tipo;
        this.fecha = fecha;
    }

    public Long getAjusteId() {
        return ajusteId;
    }

    public void setAjusteId(Long ajusteId) {
        this.ajusteId = ajusteId;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
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

    @XmlTransient
    public List<Ajustedetalle> getAjustedetalleList() {
        return ajustedetalleList;
    }

    public void setAjustedetalleList(List<Ajustedetalle> ajustedetalleList) {
        this.ajustedetalleList = ajustedetalleList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (ajusteId != null ? ajusteId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Ajuste)) {
            return false;
        }
        Ajuste other = (Ajuste) object;
        if ((this.ajusteId == null && other.ajusteId != null) || (this.ajusteId != null && !this.ajusteId.equals(other.ajusteId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.inventario.entidades.Ajuste[ ajusteId=" + ajusteId + " ]";
    }
    
}
