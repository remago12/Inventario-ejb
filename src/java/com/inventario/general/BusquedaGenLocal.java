/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.inventario.general;

import com.inventario.entidades.Giro;
import com.inventario.entidades.Pais;
import com.inventario.entidades.Persona;
import java.util.List;
import javax.ejb.Local;
import javax.persistence.Entity;

/**
 *
 * @author Rene Gomez
 */
@Local
public interface BusquedaGenLocal {

    /**
     * Método que sirve para buscar una persona o lista de personas dependiendo
     * de los parámetros enviados al método.
     * @param nombrs Nombre para buscar
     * @param apellids Apellidos que desea filtrar
     * @param dui Número de Dui de la persona
     * @return Lista de personas según filtro de búsqueda.
     * @throws Exception excepcion general
     */
    public List<Persona> busqPersonas(String nombrs, String apellids, String dui) 
            throws Exception;

    /**
     * Método que busca lista de giros para una empresa
     * @param idGiro recibe como parametro el idGiro
     * @param nombre recibe como parametro el nombre del giro
     * @return Lista de giros.
     * @throws Exception lanza excepción generica.
     */
    public List<Giro> buscarGiros(Long idGiro, String nombre) throws Exception;

    /**
     * Método genérico que se encarga de obtener un correlativo de la base de 
     * datos.
     * @param clase Clase de la cual se intenta obtener correlativo
     * @param nombreId nombre del campo en la base de datos.
     * @return ultimo correlativo generado
     * @throws Exception en caso de error lanza excepción genérica
     */
    public Long obtenerCorr(Class clase, String nombreId) throws Exception;

    /**
     * Método encargado de realizar búsqueda de Paises
     * @param id filtro id
     * @param cod filtrado por código de pais
     * @param nombre filtrado por nombre de pais
     * @return lista de paises de acuerdo a filtro
     * @throws Exception en caso de error lanza excepción generica.
     */
    public List<Pais> busqPais(Long id, String cod, String nombre) throws Exception;
    
    
    
}
