package com.inventario.entidades;

import com.inventario.entidades.Compradetalle;
import com.inventario.entidades.Ordencompra;
import com.inventario.entidades.Proveedor;
import com.inventario.entidades.Tipofactura;
import com.inventario.entidades.Tipopago;
import com.inventario.entidades.Usuario;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-11-27T20:28:36")
@StaticMetamodel(Compra.class)
public class Compra_ { 

    public static volatile SingularAttribute<Compra, Ordencompra> ordencompraId;
    public static volatile ListAttribute<Compra, Compradetalle> compradetalleList;
    public static volatile SingularAttribute<Compra, Tipofactura> tipofacturaId;
    public static volatile SingularAttribute<Compra, Character> estado;
    public static volatile SingularAttribute<Compra, Proveedor> proveedorId;
    public static volatile SingularAttribute<Compra, Date> fecha;
    public static volatile SingularAttribute<Compra, Long> compraId;
    public static volatile SingularAttribute<Compra, String> descripcion;
    public static volatile SingularAttribute<Compra, Usuario> usuarioId;
    public static volatile SingularAttribute<Compra, String> numero;
    public static volatile SingularAttribute<Compra, Tipopago> tipopagoId;

}