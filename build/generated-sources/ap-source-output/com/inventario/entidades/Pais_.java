package com.inventario.entidades;

import com.inventario.entidades.Estado;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-11-27T20:28:36")
@StaticMetamodel(Pais.class)
public class Pais_ { 

    public static volatile SingularAttribute<Pais, String> codigo;
    public static volatile SingularAttribute<Pais, String> nombre;
    public static volatile ListAttribute<Pais, Estado> estadoList;
    public static volatile SingularAttribute<Pais, Long> paisId;

}