/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.inventario.general;

import com.inventario.entidades.Menu;
import com.inventario.entidades.Rolmenu;
import com.inventario.entidades.Usuario;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 * Clase con los métodos que se encargarán de logueo y seguridad del sistema
 * @author Rene Gomez
 * @since 11/06/15
 * @version 1
 */
@Stateless
public class BusquedaSeg implements BusquedaSegLocal {
    @PersistenceContext(unitName = "Inventario-ejbPU")
    private EntityManager em;

    public void persist(Object object) {
        em.persist(object);
    }
    
    @Override
    public Usuario buscarUsuario(String codusr) throws NoResultException, Exception{
        Usuario usr = null;
        Query q;
        try {
            System.out.println("antes de select: ");
            q = em.createQuery("Select u from Usuario u where u.usuario = :usr");
            q.setParameter("usr", codusr);
            System.out.println("Query ejecutado: "+ q.toString());
            usr = (Usuario)q.getSingleResult();
        } catch(NoResultException e){
                return null;
        } catch (Exception e) {
            throw new Exception("Problemas al buscar usuario: "+ e.getMessage());
        }
        return usr;
    }
    
    @Override
    public List<Menu> obtieneMenus(Long idMenuPadre) throws NoResultException, Exception{
        System.out.println("obtieneMenus: "+idMenuPadre);
        List<Menu> menuLst = new ArrayList<>();
        try {
            StringBuilder sql = new StringBuilder("Select m from Menu m ");
            if(idMenuPadre != null){
                sql.append("where m.menuFk.menuId = :idPadre ");
            }
            sql.append("order by m.menuId ASC");
            System.out.println("Query ejecutado obtieneMenus: "+sql.toString());
            Query q = em.createQuery(sql.toString());
            if(idMenuPadre!=null){
                q.setParameter("idPadre",idMenuPadre);
            }
            menuLst = q.getResultList();
            System.out.println("Resultado: "+menuLst.size());
            return menuLst;
        } catch(NoResultException e){
            return null;
        }catch (Exception e) {
            throw new Exception("Error en el metodo obtieneMenus \n");
        }
    }
    
    @Override
    public List<Rolmenu> obtieneMenuxRol(Long idRol) throws Exception{
        System.out.println("ObtieneMenuxRol.. "+idRol);
        List<Rolmenu> opciones = null;
        try {
            Query q = em.createQuery("");
            q.setParameter("idrol",idRol );
            System.out.println("Query ejecutado: "+q.getResultList());
            opciones= q.getResultList();
            return opciones;
        } catch(NoResultException e){
                return null;
        } catch (Exception e) {
            throw new Exception("Error en el metodo obtieneMenuxUsuario \n");
        }
    }

    public String autenticarUser(){
        
        return "";
    }
    
    
}
