package com.inventario.entidades;

import com.inventario.entidades.Producto;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-11-27T20:28:36")
@StaticMetamodel(Unidadmedida.class)
public class Unidadmedida_ { 

    public static volatile SingularAttribute<Unidadmedida, String> nombre;
    public static volatile SingularAttribute<Unidadmedida, String> abreviatura;
    public static volatile SingularAttribute<Unidadmedida, Long> unidadId;
    public static volatile SingularAttribute<Unidadmedida, String> descripcion;
    public static volatile ListAttribute<Unidadmedida, Producto> productoList;

}