/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.inventario.general;

import com.inventario.entidades.Menu;
import com.inventario.entidades.Rolmenu;
import com.inventario.entidades.Usuario;
import java.util.List;
import javax.ejb.Local;
import javax.persistence.NoResultException;

/**
 *
 * @author Rene Gomez
 */
@Local
public interface BusquedaSegLocal {

    /**
     * Método para buscar un usuario
     * @param codusr código de usuario
     * @return usuario encontrado
     * @throws Exception generica
     */
    public Usuario buscarUsuario(String codusr) throws Exception;

    /**
     * Método que realiza busqueda de todos los menus asi como tambien filtrados
     * por menú padre.
     * @param idMenuPadre Menu padre que desea filtrar
     * @return Lista de menús
     * @throws NoResultException retorna null
     * @throws Exception envía mensaje genérico
     */
    public List<Menu> obtieneMenus(Long idMenuPadre) throws NoResultException, Exception;

    /**
     * Método para obtener la lista de menu asignado a un rol
     * @param idRol Rol que desea filtrar
     * @return lista de menu por rol
     * @throws Exception excepcion generica
     */
    public List<Rolmenu> obtieneMenuxRol(Long idRol) throws Exception;
    
}
