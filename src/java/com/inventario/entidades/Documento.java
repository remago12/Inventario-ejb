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
@Table(name = "DOCUMENTO", catalog = "", schema = "INVENTARIO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Documento.findAll", query = "SELECT d FROM Documento d"),
    @NamedQuery(name = "Documento.findByDocumentoId", query = "SELECT d FROM Documento d WHERE d.documentoId = :documentoId"),
    @NamedQuery(name = "Documento.findByNumero", query = "SELECT d FROM Documento d WHERE d.numero = :numero")})
public class Documento implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "DOCUMENTO_ID")
    private Long documentoId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 25)
    @Column(name = "NUMERO")
    private String numero;
    @JoinColumn(name = "PERSONA_ID", referencedColumnName = "PERSONA_ID")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Persona personaId;
    @JoinColumn(name = "DOCTIPO_ID", referencedColumnName = "DOCTIPO_ID")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Documentotipo doctipoId;

    public Documento() {
    }

    public Documento(Long documentoId) {
        this.documentoId = documentoId;
    }

    public Documento(Long documentoId, String numero) {
        this.documentoId = documentoId;
        this.numero = numero;
    }

    public Long getDocumentoId() {
        return documentoId;
    }

    public void setDocumentoId(Long documentoId) {
        this.documentoId = documentoId;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Persona getPersonaId() {
        return personaId;
    }

    public void setPersonaId(Persona personaId) {
        this.personaId = personaId;
    }

    public Documentotipo getDoctipoId() {
        return doctipoId;
    }

    public void setDoctipoId(Documentotipo doctipoId) {
        this.doctipoId = doctipoId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (documentoId != null ? documentoId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Documento)) {
            return false;
        }
        Documento other = (Documento) object;
        if ((this.documentoId == null && other.documentoId != null) || (this.documentoId != null && !this.documentoId.equals(other.documentoId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.inventario.entidades.Documento[ documentoId=" + documentoId + " ]";
    }
    
}
