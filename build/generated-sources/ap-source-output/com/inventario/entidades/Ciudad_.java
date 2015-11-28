package com.inventario.entidades;

import com.inventario.entidades.Estado;
import com.inventario.entidades.Persona;
import com.inventario.entidades.Proveedor;
import com.inventario.entidades.Sucursal;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-11-27T20:28:35")
@StaticMetamodel(Ciudad.class)
public class Ciudad_ { 

    public static volatile SingularAttribute<Ciudad, String> nombre;
    public static volatile SingularAttribute<Ciudad, Long> ciudadId;
    public static volatile SingularAttribute<Ciudad, Estado> estadoId;
    public static volatile ListAttribute<Ciudad, Sucursal> sucursalList;
    public static volatile ListAttribute<Ciudad, Persona> personaList;
    public static volatile ListAttribute<Ciudad, Proveedor> proveedorList;

}