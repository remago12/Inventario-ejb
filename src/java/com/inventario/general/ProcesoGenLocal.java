/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.inventario.general;

import com.inventario.entidades.Persona;
import javax.ejb.Local;

/**
 *
 * @author Rene Gomez
 */
@Local
public interface ProcesoGenLocal {
    
    /**
     * Método que se encarga de Guardar objeto Persona
     * @param per Objeto lleno de tipo Persona
     * @return String con la respuesta si fue satisfactorio o no.
     */
    public String guardarPersona(Persona per);
}
