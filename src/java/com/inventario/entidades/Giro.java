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
@Table(name = "GIRO", catalog = "", schema = "INVENTARIO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Giro.findAll", query = "SELECT g FROM Giro g"),
    @NamedQuery(name = "Giro.findByGiroId", query = "SELECT g FROM Giro g WHERE g.giroId = :giroId"),
    @NamedQuery(name = "Giro.findByNombre", query = "SELECT g FROM Giro g WHERE g.nombre = :nombre"),
    @NamedQuery(name = "Giro.findByDescripcion", query = "SELECT g FROM Giro g WHERE g.descripcion = :descripcion")})
public class Giro implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "GIRO_ID")
    private Long giroId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 25)
    @Column(name = "NOMBRE")
    private String nombre;
    @Size(max = 500)
    @Column(name = "DESCRIPCION")
    private String descripcion;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "giroId", fetch = FetchType.LAZY)
    private List<Proveedor> proveedorList;
    @OneToMany(mappedBy = "giroId", fetch = FetchType.LAZY)
    private List<Cliente> clienteList;

    public Giro() {
    }

    public Giro(Long giroId) {
        this.giroId = giroId;
    }

    public Giro(Long giroId, String nombre) {
        this.giroId = giroId;
        this.nombre = nombre;
    }

    public Long getGiroId() {
        return giroId;
    }

    public void setGiroId(Long giroId) {
        this.giroId = giroId;
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
    public List<Proveedor> getProveedorList() {
        return proveedorList;
    }

    public void setProveedorList(List<Proveedor> proveedorList) {
        this.proveedorList = proveedorList;
    }

    @XmlTransient
    public List<Cliente> getClienteList() {
        return clienteList;
    }

    public void setClienteList(List<Cliente> clienteList) {
        this.clienteList = clienteList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (giroId != null ? giroId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Giro)) {
            return false;
        }
        Giro other = (Giro) object;
        if ((this.giroId == null && other.giroId != null) || (this.giroId != null && !this.giroId.equals(other.giroId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.inventario.entidades.Giro[ giroId=" + giroId + " ]";
    }
    
}
