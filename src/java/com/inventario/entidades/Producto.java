/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.inventario.entidades;

import java.io.Serializable;
import java.math.BigDecimal;
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
@Table(name = "PRODUCTO", catalog = "", schema = "INVENTARIO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Producto.findAll", query = "SELECT p FROM Producto p"),
    @NamedQuery(name = "Producto.findByProductoId", query = "SELECT p FROM Producto p WHERE p.productoId = :productoId"),
    @NamedQuery(name = "Producto.findByCodigo", query = "SELECT p FROM Producto p WHERE p.codigo = :codigo"),
    @NamedQuery(name = "Producto.findByNombre", query = "SELECT p FROM Producto p WHERE p.nombre = :nombre"),
    @NamedQuery(name = "Producto.findByAlerta", query = "SELECT p FROM Producto p WHERE p.alerta = :alerta"),
    @NamedQuery(name = "Producto.findByStockmin", query = "SELECT p FROM Producto p WHERE p.stockmin = :stockmin"),
    @NamedQuery(name = "Producto.findByStock", query = "SELECT p FROM Producto p WHERE p.stock = :stock"),
    @NamedQuery(name = "Producto.findByStockmax", query = "SELECT p FROM Producto p WHERE p.stockmax = :stockmax"),
    @NamedQuery(name = "Producto.findByCosto", query = "SELECT p FROM Producto p WHERE p.costo = :costo"),
    @NamedQuery(name = "Producto.findByPrecio", query = "SELECT p FROM Producto p WHERE p.precio = :precio"),
    @NamedQuery(name = "Producto.findByPeso", query = "SELECT p FROM Producto p WHERE p.peso = :peso"),
    @NamedQuery(name = "Producto.findByFechainicio", query = "SELECT p FROM Producto p WHERE p.fechainicio = :fechainicio"),
    @NamedQuery(name = "Producto.findByFechafin", query = "SELECT p FROM Producto p WHERE p.fechafin = :fechafin")})
public class Producto implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "PRODUCTO_ID")
    private Long productoId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 25)
    @Column(name = "CODIGO")
    private String codigo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 75)
    @Column(name = "NOMBRE")
    private String nombre;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ALERTA")
    private Character alerta;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Column(name = "STOCKMIN")
    private BigDecimal stockmin;
    @Basic(optional = false)
    @NotNull
    @Column(name = "STOCK")
    private BigDecimal stock;
    @Basic(optional = false)
    @NotNull
    @Column(name = "STOCKMAX")
    private BigDecimal stockmax;
    @Basic(optional = false)
    @NotNull
    @Column(name = "COSTO")
    private BigDecimal costo;
    @Basic(optional = false)
    @NotNull
    @Column(name = "PRECIO")
    private BigDecimal precio;
    @Column(name = "PESO")
    private BigDecimal peso;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FECHAINICIO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechainicio;
    @Column(name = "FECHAFIN")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechafin;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "productoId", fetch = FetchType.LAZY)
    private List<Facturadetalle> facturadetalleList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "producto", fetch = FetchType.LAZY)
    private List<Productohist> productohistList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "producto", fetch = FetchType.LAZY)
    private List<Productoinventario> productoinventarioList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "productoId", fetch = FetchType.LAZY)
    private List<Ordencompradetalle> ordencompradetalleList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "productoId", fetch = FetchType.LAZY)
    private List<Compradetalle> compradetalleList;
    @JoinColumn(name = "UNIDAD_ID", referencedColumnName = "UNIDAD_ID")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Unidadmedida unidadId;
    @JoinColumn(name = "PRODCAT_ID", referencedColumnName = "PRODCAT_ID")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Productocategoria prodcatId;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "productoId", fetch = FetchType.LAZY)
    private List<Notacreditodetalle> notacreditodetalleList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "producto", fetch = FetchType.LAZY)
    private List<Kardex> kardexList;

    public Producto() {
    }

    public Producto(Long productoId) {
        this.productoId = productoId;
    }

    public Producto(Long productoId, String codigo, String nombre, Character alerta, BigDecimal stockmin, BigDecimal stock, BigDecimal stockmax, BigDecimal costo, BigDecimal precio, Date fechainicio) {
        this.productoId = productoId;
        this.codigo = codigo;
        this.nombre = nombre;
        this.alerta = alerta;
        this.stockmin = stockmin;
        this.stock = stock;
        this.stockmax = stockmax;
        this.costo = costo;
        this.precio = precio;
        this.fechainicio = fechainicio;
    }

    public Long getProductoId() {
        return productoId;
    }

    public void setProductoId(Long productoId) {
        this.productoId = productoId;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Character getAlerta() {
        return alerta;
    }

    public void setAlerta(Character alerta) {
        this.alerta = alerta;
    }

    public BigDecimal getStockmin() {
        return stockmin;
    }

    public void setStockmin(BigDecimal stockmin) {
        this.stockmin = stockmin;
    }

    public BigDecimal getStock() {
        return stock;
    }

    public void setStock(BigDecimal stock) {
        this.stock = stock;
    }

    public BigDecimal getStockmax() {
        return stockmax;
    }

    public void setStockmax(BigDecimal stockmax) {
        this.stockmax = stockmax;
    }

    public BigDecimal getCosto() {
        return costo;
    }

    public void setCosto(BigDecimal costo) {
        this.costo = costo;
    }

    public BigDecimal getPrecio() {
        return precio;
    }

    public void setPrecio(BigDecimal precio) {
        this.precio = precio;
    }

    public BigDecimal getPeso() {
        return peso;
    }

    public void setPeso(BigDecimal peso) {
        this.peso = peso;
    }

    public Date getFechainicio() {
        return fechainicio;
    }

    public void setFechainicio(Date fechainicio) {
        this.fechainicio = fechainicio;
    }

    public Date getFechafin() {
        return fechafin;
    }

    public void setFechafin(Date fechafin) {
        this.fechafin = fechafin;
    }

    @XmlTransient
    public List<Facturadetalle> getFacturadetalleList() {
        return facturadetalleList;
    }

    public void setFacturadetalleList(List<Facturadetalle> facturadetalleList) {
        this.facturadetalleList = facturadetalleList;
    }

    @XmlTransient
    public List<Productohist> getProductohistList() {
        return productohistList;
    }

    public void setProductohistList(List<Productohist> productohistList) {
        this.productohistList = productohistList;
    }

    @XmlTransient
    public List<Productoinventario> getProductoinventarioList() {
        return productoinventarioList;
    }

    public void setProductoinventarioList(List<Productoinventario> productoinventarioList) {
        this.productoinventarioList = productoinventarioList;
    }

    @XmlTransient
    public List<Ordencompradetalle> getOrdencompradetalleList() {
        return ordencompradetalleList;
    }

    public void setOrdencompradetalleList(List<Ordencompradetalle> ordencompradetalleList) {
        this.ordencompradetalleList = ordencompradetalleList;
    }

    @XmlTransient
    public List<Compradetalle> getCompradetalleList() {
        return compradetalleList;
    }

    public void setCompradetalleList(List<Compradetalle> compradetalleList) {
        this.compradetalleList = compradetalleList;
    }

    public Unidadmedida getUnidadId() {
        return unidadId;
    }

    public void setUnidadId(Unidadmedida unidadId) {
        this.unidadId = unidadId;
    }

    public Productocategoria getProdcatId() {
        return prodcatId;
    }

    public void setProdcatId(Productocategoria prodcatId) {
        this.prodcatId = prodcatId;
    }

    @XmlTransient
    public List<Notacreditodetalle> getNotacreditodetalleList() {
        return notacreditodetalleList;
    }

    public void setNotacreditodetalleList(List<Notacreditodetalle> notacreditodetalleList) {
        this.notacreditodetalleList = notacreditodetalleList;
    }

    @XmlTransient
    public List<Kardex> getKardexList() {
        return kardexList;
    }

    public void setKardexList(List<Kardex> kardexList) {
        this.kardexList = kardexList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (productoId != null ? productoId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Producto)) {
            return false;
        }
        Producto other = (Producto) object;
        if ((this.productoId == null && other.productoId != null) || (this.productoId != null && !this.productoId.equals(other.productoId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.inventario.entidades.Producto[ productoId=" + productoId + " ]";
    }
    
}
