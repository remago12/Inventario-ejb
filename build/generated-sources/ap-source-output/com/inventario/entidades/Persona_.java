package com.inventario.entidades;

import com.inventario.entidades.Ciudad;
import com.inventario.entidades.Cliente;
import com.inventario.entidades.Contacto;
import com.inventario.entidades.Documento;
import com.inventario.entidades.Empleado;
import com.inventario.entidades.Usuario;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-11-27T20:28:36")
@StaticMetamodel(Persona.class)
public class Persona_ { 

    public static volatile SingularAttribute<Persona, Character> tipoper;
    public static volatile SingularAttribute<Persona, String> direccion;
    public static volatile SingularAttribute<Persona, Character> genero;
    public static volatile SingularAttribute<Persona, Long> personaId;
    public static volatile SingularAttribute<Persona, String> nombres;
    public static volatile SingularAttribute<Persona, Ciudad> ciudadId;
    public static volatile SingularAttribute<Persona, String> apellidos;
    public static volatile SingularAttribute<Persona, Empleado> empleado;
    public static volatile ListAttribute<Persona, Usuario> usuarioList;
    public static volatile SingularAttribute<Persona, Date> fechanac;
    public static volatile ListAttribute<Persona, Cliente> clienteList;
    public static volatile ListAttribute<Persona, Documento> documentoList;
    public static volatile ListAttribute<Persona, Contacto> contactoList;

}