package com.inventario.entidades;

import com.inventario.entidades.Giro;
import com.inventario.entidades.Persona;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-11-27T20:28:36")
@StaticMetamodel(Cliente.class)
public class Cliente_ { 

    public static volatile SingularAttribute<Cliente, Character> contribuyente;
    public static volatile SingularAttribute<Cliente, Persona> personaId;
    public static volatile SingularAttribute<Cliente, Long> clienteId;
    public static volatile SingularAttribute<Cliente, String> descripcion;
    public static volatile SingularAttribute<Cliente, Giro> giroId;

}