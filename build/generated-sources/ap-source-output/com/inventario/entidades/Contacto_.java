package com.inventario.entidades;

import com.inventario.entidades.Persona;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-11-27T20:28:36")
@StaticMetamodel(Contacto.class)
public class Contacto_ { 

    public static volatile SingularAttribute<Contacto, Persona> personaId;
    public static volatile SingularAttribute<Contacto, String> valor;
    public static volatile SingularAttribute<Contacto, Character> tipo;
    public static volatile SingularAttribute<Contacto, Long> contactoId;

}