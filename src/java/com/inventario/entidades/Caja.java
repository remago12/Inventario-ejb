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
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Rene Gomez
 */
@Entity
@Table(name = "CAJA", catalog = "", schema = "INVENTARIO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Caja.findAll", query = "SELECT c FROM Caja c"),
    @NamedQuery(name = "Caja.findBySucursalId", query = "SELECT c FROM Caja c WHERE c.cajaPK.sucursalId = :sucursalId"),
    @NamedQuery(name = "Caja.findByFecha", query = "SELECT c FROM Caja c WHERE c.cajaPK.fecha = :fecha"),
    @NamedQuery(name = "Caja.findByMontoinicial", query = "SELECT c FROM Caja c WHERE c.montoinicial = :montoinicial"),
    @NamedQuery(name = "Caja.findByMontofinal", query = "SELECT c FROM Caja c WHERE c.montofinal = :montofinal"),
    @NamedQuery(name = "Caja.findByDescripcion", query = "SELECT c FROM Caja c WHERE c.descripcion = :descripcion")})
public class Caja implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected CajaPK cajaPK;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Column(name = "MONTOINICIAL")
    private BigDecimal montoinicial;
    @Basic(optional = false)
    @NotNull
    @Column(name = "MONTOFINAL")
    private BigDecimal montofinal;
    @Size(max = 500)
    @Column(name = "DESCRIPCION")
    private String descripcion;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "caja", fetch = FetchType.LAZY)
    private List<Cajasalida> cajasalidaList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "caja", fetch = FetchType.LAZY)
    private List<Cajaentrada> cajaentradaList;
    @JoinColumn(name = "SUCURSAL_ID", referencedColumnName = "SUCURSAL_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Sucursal sucursal;

    public Caja() {
    }

    public Caja(CajaPK cajaPK) {
        this.cajaPK = cajaPK;
    }

    public Caja(CajaPK cajaPK, BigDecimal montoinicial, BigDecimal montofinal) {
        this.cajaPK = cajaPK;
        this.montoinicial = montoinicial;
        this.montofinal = montofinal;
    }

    public Caja(long sucursalId, Date fecha) {
        this.cajaPK = new CajaPK(sucursalId, fecha);
    }

    public CajaPK getCajaPK() {
        return cajaPK;
    }

    public void setCajaPK(CajaPK cajaPK) {
        this.cajaPK = cajaPK;
    }

    public BigDecimal getMontoinicial() {
        return montoinicial;
    }

    public void setMontoinicial(BigDecimal montoinicial) {
        this.montoinicial = montoinicial;
    }

    public BigDecimal getMontofinal() {
        return montofinal;
    }

    public void setMontofinal(BigDecimal montofinal) {
        this.montofinal = montofinal;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @XmlTransient
    public List<Cajasalida> getCajasalidaList() {
        return cajasalidaList;
    }

    public void setCajasalidaList(List<Cajasalida> cajasalidaList) {
        this.cajasalidaList = cajasalidaList;
    }

    @XmlTransient
    public List<Cajaentrada> getCajaentradaList() {
        return cajaentradaList;
    }

    public void setCajaentradaList(List<Cajaentrada> cajaentradaList) {
        this.cajaentradaList = cajaentradaList;
    }

    public Sucursal getSucursal() {
        return sucursal;
    }

    public void setSucursal(Sucursal sucursal) {
        this.sucursal = sucursal;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cajaPK != null ? cajaPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Caja)) {
            return false;
        }
        Caja other = (Caja) object;
        if ((this.cajaPK == null && other.cajaPK != null) || (this.cajaPK != null && !this.cajaPK.equals(other.cajaPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.inventario.entidades.Caja[ cajaPK=" + cajaPK + " ]";
    }
    
}
