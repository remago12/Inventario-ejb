package com.inventario.entidades;

import com.inventario.entidades.Producto;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-11-27T20:28:36")
@StaticMetamodel(Productocategoria.class)
public class Productocategoria_ { 

    public static volatile SingularAttribute<Productocategoria, String> nombre;
    public static volatile SingularAttribute<Productocategoria, Long> prodcatId;
    public static volatile SingularAttribute<Productocategoria, String> descripcion;
    public static volatile ListAttribute<Productocategoria, Producto> productoList;

}