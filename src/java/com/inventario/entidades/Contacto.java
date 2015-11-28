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
@Table(name = "CONTACTO", catalog = "", schema = "INVENTARIO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Contacto.findAll", query = "SELECT c FROM Contacto c"),
    @NamedQuery(name = "Contacto.findByContactoId", query = "SELECT c FROM Contacto c WHERE c.contactoId = :contactoId"),
    @NamedQuery(name = "Contacto.findByValor", query = "SELECT c FROM Contacto c WHERE c.valor = :valor"),
    @NamedQuery(name = "Contacto.findByTipo", query = "SELECT c FROM Contacto c WHERE c.tipo = :tipo")})
public class Contacto implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "CONTACTO_ID")
    private Long contactoId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "VALOR")
    private String valor;
    @Basic(optional = false)
    @NotNull
    @Column(name = "TIPO")
    private Character tipo;
    @JoinColumn(name = "PERSONA_ID", referencedColumnName = "PERSONA_ID")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Persona personaId;

    public Contacto() {
    }

    public Contacto(Long contactoId) {
        this.contactoId = contactoId;
    }

    public Contacto(Long contactoId, String valor, Character tipo) {
        this.contactoId = contactoId;
        this.valor = valor;
        this.tipo = tipo;
    }

    public Long getContactoId() {
        return contactoId;
    }

    public void setContactoId(Long contactoId) {
        this.contactoId = contactoId;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public Character getTipo() {
        return tipo;
    }

    public void setTipo(Character tipo) {
        this.tipo = tipo;
    }

    public Persona getPersonaId() {
        return personaId;
    }

    public void setPersonaId(Persona personaId) {
        this.personaId = personaId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (contactoId != null ? contactoId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Contacto)) {
            return false;
        }
        Contacto other = (Contacto) object;
        if ((this.contactoId == null && other.contactoId != null) || (this.contactoId != null && !this.contactoId.equals(other.contactoId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.inventario.entidades.Contacto[ contactoId=" + contactoId + " ]";
    }
    
}
