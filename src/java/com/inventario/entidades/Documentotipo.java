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
@Table(name = "DOCUMENTOTIPO", catalog = "", schema = "INVENTARIO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Documentotipo.findAll", query = "SELECT d FROM Documentotipo d"),
    @NamedQuery(name = "Documentotipo.findByDoctipoId", query = "SELECT d FROM Documentotipo d WHERE d.doctipoId = :doctipoId"),
    @NamedQuery(name = "Documentotipo.findByNombre", query = "SELECT d FROM Documentotipo d WHERE d.nombre = :nombre"),
    @NamedQuery(name = "Documentotipo.findByMascara", query = "SELECT d FROM Documentotipo d WHERE d.mascara = :mascara"),
    @NamedQuery(name = "Documentotipo.findByDescripcion", query = "SELECT d FROM Documentotipo d WHERE d.descripcion = :descripcion")})
public class Documentotipo implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "DOCTIPO_ID")
    private Long doctipoId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "NOMBRE")
    private String nombre;
    @Basic(optional = false)
    @NotNull
    @Column(name = "MASCARA")
    private short mascara;
    @Size(max = 500)
    @Column(name = "DESCRIPCION")
    private String descripcion;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "doctipoId", fetch = FetchType.LAZY)
    private List<Documento> documentoList;

    public Documentotipo() {
    }

    public Documentotipo(Long doctipoId) {
        this.doctipoId = doctipoId;
    }

    public Documentotipo(Long doctipoId, String nombre, short mascara) {
        this.doctipoId = doctipoId;
        this.nombre = nombre;
        this.mascara = mascara;
    }

    public Long getDoctipoId() {
        return doctipoId;
    }

    public void setDoctipoId(Long doctipoId) {
        this.doctipoId = doctipoId;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public short getMascara() {
        return mascara;
    }

    public void setMascara(short mascara) {
        this.mascara = mascara;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @XmlTransient
    public List<Documento> getDocumentoList() {
        return documentoList;
    }

    public void setDocumentoList(List<Documento> documentoList) {
        this.documentoList = documentoList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (doctipoId != null ? doctipoId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Documentotipo)) {
            return false;
        }
        Documentotipo other = (Documentotipo) object;
        if ((this.doctipoId == null && other.doctipoId != null) || (this.doctipoId != null && !this.doctipoId.equals(other.doctipoId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.inventario.entidades.Documentotipo[ doctipoId=" + doctipoId + " ]";
    }
    
}
