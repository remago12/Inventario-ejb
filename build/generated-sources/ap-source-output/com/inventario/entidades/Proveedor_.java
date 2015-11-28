package com.inventario.entidades;

import com.inventario.entidades.Ciudad;
import com.inventario.entidades.Compra;
import com.inventario.entidades.Giro;
import com.inventario.entidades.Ordencompra;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-11-27T20:28:36")
@StaticMetamodel(Proveedor.class)
public class Proveedor_ { 

    public static volatile SingularAttribute<Proveedor, String> nombre;
    public static volatile SingularAttribute<Proveedor, String> numregistro;
    public static volatile SingularAttribute<Proveedor, String> direccion;
    public static volatile SingularAttribute<Proveedor, Long> proveedorId;
    public static volatile SingularAttribute<Proveedor, Character> estado;
    public static volatile SingularAttribute<Proveedor, Ciudad> ciudadId;
    public static volatile ListAttribute<Proveedor, Compra> compraList;
    public static volatile ListAttribute<Proveedor, Ordencompra> ordencompraList;
    public static volatile SingularAttribute<Proveedor, String> nit;
    public static volatile SingularAttribute<Proveedor, String> descripcion;
    public static volatile SingularAttribute<Proveedor, Giro> giroId;

}