/*
 * Librerias necesarias para la clase.
 */
package com.inventario.general;

import com.inventario.entidades.Giro;
import com.inventario.entidades.Persona;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 * Clase que contendrá las busquedas generales y comunes para las pantallas
 * @author Rene Gomez G
 * @since 28/10/2015
 */
@Stateless
public class BusquedaGen implements BusquedaGenLocal {
    @PersistenceContext(unitName = "Inventario-ejbPU")
    private EntityManager em;

    public void persist(Object object) {
        em.persist(object);
    }
    
    @Override
    public List<Persona> busqPersonas(String nombrs, String apellids, String dui)
        throws Exception{
        List<Persona> personLst = new ArrayList<>();
        try {
            System.out.println("Ingresa a realizar busqueda");
            StringBuilder sql = new StringBuilder();
            sql.append("Select p from Persona p where 1 = 1 ");
            if(nombrs!=null && !nombrs.isEmpty()){
                sql.append("and p.nombres like '%").append(nombrs).append("' ");
            }
            if(apellids!=null && !apellids.isEmpty()){
                sql.append("and p.apellidos like '%").append(apellids).append("' ");
            }
            
            System.out.println("Antes de ejecutar Query: "+sql.toString());
            Query q = em.createQuery(sql.toString());
            System.out.println("despues que realiza query: "+q.getResultList());
            personLst = q.getResultList();
            
        } catch (NoResultException e) {
            System.out.println("No se obtuvieron datos..");
            return null;
        } catch (Exception e) {
            throw new Exception("Error al realizar búsqueda: "+e.getMessage());
        }
        return personLst;
    } 
    
    @Override
    public List<Giro> buscarGiros(Long idGiro, String nombre) throws Exception {
        List<Giro> giroLst = new ArrayList<>();
        try {
            StringBuilder sql = new StringBuilder();
            sql.append("Select g from Giro g where 1=1 ");
            if (idGiro != null && idGiro != 0) {
                sql.append("and g.giroId = ").append(idGiro).append(" ");
            }
            if (nombre != null && !nombre.isEmpty()) {
                sql.append("and UPPER(g.nombre) like '%").append(
                        nombre.toUpperCase()).append("%'");
            }

            Query q = em.createQuery(sql.toString());
            giroLst = q.getResultList();
        } catch (NoResultException e) {
            return null;
        } catch (Exception e) {
            throw new Exception("Error al realizar búsqueda: " + e.getMessage());
        }
        return giroLst;
    }
 
    @Override
    public Long obtenerCorr(Class clase, String nombreId) throws Exception{
        Long idCorrelativo = new Long("0");
        try {
            Query q = em.createQuery("Select max(v."+nombreId+")+1 from "+clase.getSimpleName()+" v");
            idCorrelativo = (Long)q.getSingleResult();
            System.out.println("Correlativo obtenido: "+idCorrelativo);
        } catch (NoResultException e) {
          return Long.valueOf("0");  
        } catch (Exception e) {
            throw new Exception("Error obteniendo correlativo: " 
                    + getClass().getSimpleName()+", "+ e.getMessage());
        }
        
        return idCorrelativo;
    }
}
