package com.inventario.entidades;

import com.inventario.entidades.Sucursal;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-11-27T20:28:35")
@StaticMetamodel(Parametro.class)
public class Parametro_ { 

    public static volatile SingularAttribute<Parametro, String> nombre;
    public static volatile SingularAttribute<Parametro, Sucursal> sucursalId;
    public static volatile SingularAttribute<Parametro, Long> paramId;
    public static volatile SingularAttribute<Parametro, String> valor;
    public static volatile SingularAttribute<Parametro, String> descripcion;

}