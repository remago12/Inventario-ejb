/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.inventario.entidades;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;

/**
 *
 * @author Rene Gomez
 */
@Embeddable
public class RolmenuPK implements Serializable {
    @Basic(optional = false)
    @NotNull
    @Column(name = "ROL_ID")
    private long rolId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "MENU_ID")
    private long menuId;

    public RolmenuPK() {
    }

    public RolmenuPK(long rolId, long menuId) {
        this.rolId = rolId;
        this.menuId = menuId;
    }

    public long getRolId() {
        return rolId;
    }

    public void setRolId(long rolId) {
        this.rolId = rolId;
    }

    public long getMenuId() {
        return menuId;
    }

    public void setMenuId(long menuId) {
        this.menuId = menuId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) rolId;
        hash += (int) menuId;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RolmenuPK)) {
            return false;
        }
        RolmenuPK other = (RolmenuPK) object;
        if (this.rolId != other.rolId) {
            return false;
        }
        if (this.menuId != other.menuId) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.inventario.entidades.RolmenuPK[ rolId=" + rolId + ", menuId=" + menuId + " ]";
    }
    
}
