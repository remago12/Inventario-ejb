package com.inventario.entidades;

import com.inventario.entidades.Caja;
import com.inventario.entidades.Ciudad;
import com.inventario.entidades.Empleado;
import com.inventario.entidades.Parametro;
import com.inventario.entidades.Seccion;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-11-27T20:28:36")
@StaticMetamodel(Sucursal.class)
public class Sucursal_ { 

    public static volatile SingularAttribute<Sucursal, String> nombre;
    public static volatile ListAttribute<Sucursal, Empleado> empleadoList;
    public static volatile SingularAttribute<Sucursal, Ciudad> ciudadId;
    public static volatile SingularAttribute<Sucursal, Long> sucursalId;
    public static volatile SingularAttribute<Sucursal, String> descripcion;
    public static volatile ListAttribute<Sucursal, Parametro> parametroList;
    public static volatile ListAttribute<Sucursal, Seccion> seccionList;
    public static volatile ListAttribute<Sucursal, Caja> cajaList;

}