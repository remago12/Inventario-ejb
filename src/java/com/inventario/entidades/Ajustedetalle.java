/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.inventario.entidades;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
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
@Table(name = "AJUSTEDETALLE", catalog = "", schema = "INVENTARIO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Ajustedetalle.findAll", query = "SELECT a FROM Ajustedetalle a"),
    @NamedQuery(name = "Ajustedetalle.findByAjustedetalleId", query = "SELECT a FROM Ajustedetalle a WHERE a.ajustedetallePK.ajustedetalleId = :ajustedetalleId"),
    @NamedQuery(name = "Ajustedetalle.findByAjusteId", query = "SELECT a FROM Ajustedetalle a WHERE a.ajustedetallePK.ajusteId = :ajusteId"),
    @NamedQuery(name = "Ajustedetalle.findByCantidad", query = "SELECT a FROM Ajustedetalle a WHERE a.cantidad = :cantidad"),
    @NamedQuery(name = "Ajustedetalle.findByDescripcion", query = "SELECT a FROM Ajustedetalle a WHERE a.descripcion = :descripcion")})
public class Ajustedetalle implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected AjustedetallePK ajustedetallePK;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Column(name = "CANTIDAD")
    private BigDecimal cantidad;
    @Size(max = 500)
    @Column(name = "DESCRIPCION")
    private String descripcion;
    @JoinColumns({
        @JoinColumn(name = "PRODUCTO_ID", referencedColumnName = "PRODUCTO_ID"),
        @JoinColumn(name = "SECCION_ID", referencedColumnName = "SECCION_ID")})
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Productoinventario productoinventario;
    @JoinColumn(name = "AJUSTE_ID", referencedColumnName = "AJUSTE_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Ajuste ajuste;
    @OneToMany(mappedBy = "ajustedetalle", fetch = FetchType.LAZY)
    private List<Kardexsalida> kardexsalidaList;

    public Ajustedetalle() {
    }

    public Ajustedetalle(AjustedetallePK ajustedetallePK) {
        this.ajustedetallePK = ajustedetallePK;
    }

    public Ajustedetalle(AjustedetallePK ajustedetallePK, BigDecimal cantidad) {
        this.ajustedetallePK = ajustedetallePK;
        this.cantidad = cantidad;
    }

    public Ajustedetalle(long ajustedetalleId, long ajusteId) {
        this.ajustedetallePK = new AjustedetallePK(ajustedetalleId, ajusteId);
    }

    public AjustedetallePK getAjustedetallePK() {
        return ajustedetallePK;
    }

    public void setAjustedetallePK(AjustedetallePK ajustedetallePK) {
        this.ajustedetallePK = ajustedetallePK;
    }

    public BigDecimal getCantidad() {
        return cantidad;
    }

    public void setCantidad(BigDecimal cantidad) {
        this.cantidad = cantidad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Productoinventario getProductoinventario() {
        return productoinventario;
    }

    public void setProductoinventario(Productoinventario productoinventario) {
        this.productoinventario = productoinventario;
    }

    public Ajuste getAjuste() {
        return ajuste;
    }

    public void setAjuste(Ajuste ajuste) {
        this.ajuste = ajuste;
    }

    @XmlTransient
    public List<Kardexsalida> getKardexsalidaList() {
        return kardexsalidaList;
    }

    public void setKardexsalidaList(List<Kardexsalida> kardexsalidaList) {
        this.kardexsalidaList = kardexsalidaList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (ajustedetallePK != null ? ajustedetallePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Ajustedetalle)) {
            return false;
        }
        Ajustedetalle other = (Ajustedetalle) object;
        if ((this.ajustedetallePK == null && other.ajustedetallePK != null) || (this.ajustedetallePK != null && !this.ajustedetallePK.equals(other.ajustedetallePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.inventario.entidades.Ajustedetalle[ ajustedetallePK=" + ajustedetallePK + " ]";
    }
    
}
