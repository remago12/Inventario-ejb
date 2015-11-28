/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.inventario.entidades;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Rene Gomez
 */
@Entity
@Table(name = "ROLMENU", catalog = "", schema = "INVENTARIO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Rolmenu.findAll", query = "SELECT r FROM Rolmenu r"),
    @NamedQuery(name = "Rolmenu.findByRolId", query = "SELECT r FROM Rolmenu r WHERE r.rolmenuPK.rolId = :rolId"),
    @NamedQuery(name = "Rolmenu.findByMenuId", query = "SELECT r FROM Rolmenu r WHERE r.rolmenuPK.menuId = :menuId"),
    @NamedQuery(name = "Rolmenu.findByLectura", query = "SELECT r FROM Rolmenu r WHERE r.lectura = :lectura"),
    @NamedQuery(name = "Rolmenu.findByEscritura", query = "SELECT r FROM Rolmenu r WHERE r.escritura = :escritura")})
public class Rolmenu implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected RolmenuPK rolmenuPK;
    @Basic(optional = false)
    @NotNull
    @Column(name = "LECTURA")
    private Character lectura;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ESCRITURA")
    private Character escritura;
    @JoinColumn(name = "ROL_ID", referencedColumnName = "ROL_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Rol rol;
    @JoinColumn(name = "MENU_ID", referencedColumnName = "MENU_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Menu menu;

    public Rolmenu() {
    }

    public Rolmenu(RolmenuPK rolmenuPK) {
        this.rolmenuPK = rolmenuPK;
    }

    public Rolmenu(RolmenuPK rolmenuPK, Character lectura, Character escritura) {
        this.rolmenuPK = rolmenuPK;
        this.lectura = lectura;
        this.escritura = escritura;
    }

    public Rolmenu(long rolId, long menuId) {
        this.rolmenuPK = new RolmenuPK(rolId, menuId);
    }

    public RolmenuPK getRolmenuPK() {
        return rolmenuPK;
    }

    public void setRolmenuPK(RolmenuPK rolmenuPK) {
        this.rolmenuPK = rolmenuPK;
    }

    public Character getLectura() {
        return lectura;
    }

    public void setLectura(Character lectura) {
        this.lectura = lectura;
    }

    public Character getEscritura() {
        return escritura;
    }

    public void setEscritura(Character escritura) {
        this.escritura = escritura;
    }

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }

    public Menu getMenu() {
        return menu;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (rolmenuPK != null ? rolmenuPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Rolmenu)) {
            return false;
        }
        Rolmenu other = (Rolmenu) object;
        if ((this.rolmenuPK == null && other.rolmenuPK != null) || (this.rolmenuPK != null && !this.rolmenuPK.equals(other.rolmenuPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.inventario.entidades.Rolmenu[ rolmenuPK=" + rolmenuPK + " ]";
    }
    
}
