/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.inventario.entidades;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
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
@Table(name = "CLIENTE", catalog = "", schema = "INVENTARIO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Cliente.findAll", query = "SELECT c FROM Cliente c"),
    @NamedQuery(name = "Cliente.findByClienteId", query = "SELECT c FROM Cliente c WHERE c.clienteId = :clienteId"),
    @NamedQuery(name = "Cliente.findByContribuyente", query = "SELECT c FROM Cliente c WHERE c.contribuyente = :contribuyente"),
    @NamedQuery(name = "Cliente.findByDescripcion", query = "SELECT c FROM Cliente c WHERE c.descripcion = :descripcion")})
public class Cliente implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "CLIENTE_ID")
    private Long clienteId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "CONTRIBUYENTE")
    private Character contribuyente;
    @Size(max = 500)
    @Column(name = "DESCRIPCION")
    private String descripcion;
    @JoinColumn(name = "PERSONA_ID", referencedColumnName = "PERSONA_ID")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Persona personaId;
    @JoinColumn(name = "GIRO_ID", referencedColumnName = "GIRO_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Giro giroId;

    public Cliente() {
    }

    public Cliente(Long clienteId) {
        this.clienteId = clienteId;
    }

    public Cliente(Long clienteId, Character contribuyente) {
        this.clienteId = clienteId;
        this.contribuyente = contribuyente;
    }

    public Long getClienteId() {
        return clienteId;
    }

    public void setClienteId(Long clienteId) {
        this.clienteId = clienteId;
    }

    public Character getContribuyente() {
        return contribuyente;
    }

    public void setContribuyente(Character contribuyente) {
        this.contribuyente = contribuyente;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Persona getPersonaId() {
        return personaId;
    }

    public void setPersonaId(Persona personaId) {
        this.personaId = personaId;
    }

    public Giro getGiroId() {
        return giroId;
    }

    public void setGiroId(Giro giroId) {
        this.giroId = giroId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (clienteId != null ? clienteId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cliente)) {
            return false;
        }
        Cliente other = (Cliente) object;
        if ((this.clienteId == null && other.clienteId != null) || (this.clienteId != null && !this.clienteId.equals(other.clienteId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.inventario.entidades.Cliente[ clienteId=" + clienteId + " ]";
    }
    
}
