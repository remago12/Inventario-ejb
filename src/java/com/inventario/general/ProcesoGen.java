/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.inventario.general;

import com.inventario.entidades.Persona;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Rene Gomez
 */
@Stateless
public class ProcesoGen implements ProcesoGenLocal {
    @PersistenceContext(unitName = "Inventario-ejbPU")
    private EntityManager em;

    public void persist(Object object) {
        em.persist(object);
    }
    
    @Override
    public String guardarPersona(Persona per){
        System.out.println("Ingresa a método Guardar Persona");
        //Valida que el objeto venga lleno
        boolean valido = validarPersona(per);
        String respuesta = "Guardado exitosamente!";
        if(valido){
            em.persist(per);
        }else{
            respuesta = "Verificar que todos los datos han sido ingresados!";
        }
        return respuesta;
    }
    
    private boolean validarPersona(Persona per){
        boolean valido = true;
        if(per==null){
            valido = false;
        }else{
            if(per.getPersonaId()== null || per.getPersonaId() == 0){
                valido = false;
            }
            if(per.getNombres()==null || per.getNombres().isEmpty()){
                valido = false;
            }
        }
        return valido;
    }
    
}
