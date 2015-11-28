/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.inventario.entidades;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Rene Gomez
 */
@Entity
@Table(name = "TIPONOTA", catalog = "", schema = "INVENTARIO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tiponota.findAll", query = "SELECT t FROM Tiponota t"),
    @NamedQuery(name = "Tiponota.findByTiponotaId", query = "SELECT t FROM Tiponota t WHERE t.tiponotaId = :tiponotaId"),
    @NamedQuery(name = "Tiponota.findByNombre", query = "SELECT t FROM Tiponota t WHERE t.nombre = :nombre"),
    @NamedQuery(name = "Tiponota.findByDescripcion", query = "SELECT t FROM Tiponota t WHERE t.descripcion = :descripcion")})
public class Tiponota implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "TIPONOTA_ID")
    private Long tiponotaId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "NOMBRE")
    private String nombre;
    @Size(max = 500)
    @Column(name = "DESCRIPCION")
    private String descripcion;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "tiponotaId", fetch = FetchType.LAZY)
    private List<Notacredito> notacreditoList;

    public Tiponota() {
    }

    public Tiponota(Long tiponotaId) {
        this.tiponotaId = tiponotaId;
    }

    public Tiponota(Long tiponotaId, String nombre) {
        this.tiponotaId = tiponotaId;
        this.nombre = nombre;
    }

    public Long getTiponotaId() {
        return tiponotaId;
    }

    public void setTiponotaId(Long tiponotaId) {
        this.tiponotaId = tiponotaId;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @XmlTransient
    public List<Notacredito> getNotacreditoList() {
        return notacreditoList;
    }

    public void setNotacreditoList(List<Notacredito> notacreditoList) {
        this.notacreditoList = notacreditoList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (tiponotaId != null ? tiponotaId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tiponota)) {
            return false;
        }
        Tiponota other = (Tiponota) object;
        if ((this.tiponotaId == null && other.tiponotaId != null) || (this.tiponotaId != null && !this.tiponotaId.equals(other.tiponotaId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.inventario.entidades.Tiponota[ tiponotaId=" + tiponotaId + " ]";
    }
    
}
