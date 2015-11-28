package com.inventario.entidades;

import com.inventario.entidades.Ciudad;
import com.inventario.entidades.Pais;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-11-27T20:28:36")
@StaticMetamodel(Estado.class)
public class Estado_ { 

    public static volatile SingularAttribute<Estado, String> nombre;
    public static volatile SingularAttribute<Estado, Long> estadoId;
    public static volatile SingularAttribute<Estado, Pais> paisId;
    public static volatile ListAttribute<Estado, Ciudad> ciudadList;

}