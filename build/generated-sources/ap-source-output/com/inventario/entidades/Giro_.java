package com.inventario.entidades;

import com.inventario.entidades.Cliente;
import com.inventario.entidades.Proveedor;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-11-27T20:28:35")
@StaticMetamodel(Giro.class)
public class Giro_ { 

    public static volatile SingularAttribute<Giro, String> nombre;
    public static volatile SingularAttribute<Giro, Long> giroId;
    public static volatile SingularAttribute<Giro, String> descripcion;
    public static volatile ListAttribute<Giro, Cliente> clienteList;
    public static volatile ListAttribute<Giro, Proveedor> proveedorList;

}