package com.inventario.entidades;

import com.inventario.entidades.Ajuste;
import com.inventario.entidades.Cajasalida;
import com.inventario.entidades.Compra;
import com.inventario.entidades.Factura;
import com.inventario.entidades.Notacredito;
import com.inventario.entidades.Ordencompra;
import com.inventario.entidades.Persona;
import com.inventario.entidades.Rol;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-11-27T20:28:36")
@StaticMetamodel(Usuario.class)
public class Usuario_ { 

    public static volatile ListAttribute<Usuario, Notacredito> notacreditoList;
    public static volatile SingularAttribute<Usuario, Character> estado;
    public static volatile SingularAttribute<Usuario, Persona> personaId;
    public static volatile ListAttribute<Usuario, Factura> facturaList;
    public static volatile SingularAttribute<Usuario, Rol> rolId;
    public static volatile SingularAttribute<Usuario, String> usuario;
    public static volatile ListAttribute<Usuario, Ordencompra> ordencompraList;
    public static volatile ListAttribute<Usuario, Compra> compraList;
    public static volatile ListAttribute<Usuario, Cajasalida> cajasalidaList;
    public static volatile ListAttribute<Usuario, Ajuste> ajusteList;
    public static volatile SingularAttribute<Usuario, String> contrasena;
    public static volatile SingularAttribute<Usuario, Long> usuarioId;

}