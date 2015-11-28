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
@Table(name = "PRODUCTOCATEGORIA", catalog = "", schema = "INVENTARIO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Productocategoria.findAll", query = "SELECT p FROM Productocategoria p"),
    @NamedQuery(name = "Productocategoria.findByProdcatId", query = "SELECT p FROM Productocategoria p WHERE p.prodcatId = :prodcatId"),
    @NamedQuery(name = "Productocategoria.findByNombre", query = "SELECT p FROM Productocategoria p WHERE p.nombre = :nombre"),
    @NamedQuery(name = "Productocategoria.findByDescripcion", query = "SELECT p FROM Productocategoria p WHERE p.descripcion = :descripcion")})
public class Productocategoria implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "PRODCAT_ID")
    private Long prodcatId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 25)
    @Column(name = "NOMBRE")
    private String nombre;
    @Size(max = 500)
    @Column(name = "DESCRIPCION")
    private String descripcion;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "prodcatId", fetch = FetchType.LAZY)
    private List<Producto> productoList;

    public Productocategoria() {
    }

    public Productocategoria(Long prodcatId) {
        this.prodcatId = prodcatId;
    }

    public Productocategoria(Long prodcatId, String nombre) {
        this.prodcatId = prodcatId;
        this.nombre = nombre;
    }

    public Long getProdcatId() {
        return prodcatId;
    }

    public void setProdcatId(Long prodcatId) {
        this.prodcatId = prodcatId;
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
    public List<Producto> getProductoList() {
        return productoList;
    }

    public void setProductoList(List<Producto> productoList) {
        this.productoList = productoList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (prodcatId != null ? prodcatId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Productocategoria)) {
            return false;
        }
        Productocategoria other = (Productocategoria) object;
        if ((this.prodcatId == null && other.prodcatId != null) || (this.prodcatId != null && !this.prodcatId.equals(other.prodcatId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.inventario.entidades.Productocategoria[ prodcatId=" + prodcatId + " ]";
    }
    
}
