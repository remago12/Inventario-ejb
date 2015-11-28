package com.inventario.entidades;

import com.inventario.entidades.Documentotipo;
import com.inventario.entidades.Persona;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-11-27T20:28:35")
@StaticMetamodel(Documento.class)
public class Documento_ { 

    public static volatile SingularAttribute<Documento, Long> documentoId;
    public static volatile SingularAttribute<Documento, Persona> personaId;
    public static volatile SingularAttribute<Documento, Documentotipo> doctipoId;
    public static volatile SingularAttribute<Documento, String> numero;

}