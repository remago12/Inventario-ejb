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
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Rene Gomez
 */
@Entity
@Table(name = "FACTURADETALLE", catalog = "", schema = "INVENTARIO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Facturadetalle.findAll", query = "SELECT f FROM Facturadetalle f"),
    @NamedQuery(name = "Facturadetalle.findByFacturadetalleId", query = "SELECT f FROM Facturadetalle f WHERE f.facturadetallePK.facturadetalleId = :facturadetalleId"),
    @NamedQuery(name = "Facturadetalle.findByFacturaId", query = "SELECT f FROM Facturadetalle f WHERE f.facturadetallePK.facturaId = :facturaId"),
    @NamedQuery(name = "Facturadetalle.findByCantidad", query = "SELECT f FROM Facturadetalle f WHERE f.cantidad = :cantidad"),
    @NamedQuery(name = "Facturadetalle.findByPreciounidad", query = "SELECT f FROM Facturadetalle f WHERE f.preciounidad = :preciounidad")})
public class Facturadetalle implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected FacturadetallePK facturadetallePK;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Column(name = "CANTIDAD")
    private BigDecimal cantidad;
    @Basic(optional = false)
    @NotNull
    @Column(name = "PRECIOUNIDAD")
    private BigDecimal preciounidad;
    @JoinColumn(name = "PRODUCTO_ID", referencedColumnName = "PRODUCTO_ID")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Producto productoId;
    @JoinColumn(name = "FACTURA_ID", referencedColumnName = "FACTURA_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Factura factura;
    @OneToMany(mappedBy = "facturadetalle", fetch = FetchType.LAZY)
    private List<Kardexsalida> kardexsalidaList;

    public Facturadetalle() {
    }

    public Facturadetalle(FacturadetallePK facturadetallePK) {
        this.facturadetallePK = facturadetallePK;
    }

    public Facturadetalle(FacturadetallePK facturadetallePK, BigDecimal cantidad, BigDecimal preciounidad) {
        this.facturadetallePK = facturadetallePK;
        this.cantidad = cantidad;
        this.preciounidad = preciounidad;
    }

    public Facturadetalle(long facturadetalleId, long facturaId) {
        this.facturadetallePK = new FacturadetallePK(facturadetalleId, facturaId);
    }

    public FacturadetallePK getFacturadetallePK() {
        return facturadetallePK;
    }

    public void setFacturadetallePK(FacturadetallePK facturadetallePK) {
        this.facturadetallePK = facturadetallePK;
    }

    public BigDecimal getCantidad() {
        return cantidad;
    }

    public void setCantidad(BigDecimal cantidad) {
        this.cantidad = cantidad;
    }

    public BigDecimal getPreciounidad() {
        return preciounidad;
    }

    public void setPreciounidad(BigDecimal preciounidad) {
        this.preciounidad = preciounidad;
    }

    public Producto getProductoId() {
        return productoId;
    }

    public void setProductoId(Producto productoId) {
        this.productoId = productoId;
    }

    public Factura getFactura() {
        return factura;
    }

    public void setFactura(Factura factura) {
        this.factura = factura;
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
        hash += (facturadetallePK != null ? facturadetallePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Facturadetalle)) {
            return false;
        }
        Facturadetalle other = (Facturadetalle) object;
        if ((this.facturadetallePK == null && other.facturadetallePK != null) || (this.facturadetallePK != null && !this.facturadetallePK.equals(other.facturadetallePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.inventario.entidades.Facturadetalle[ facturadetallePK=" + facturadetallePK + " ]";
    }
    
}
