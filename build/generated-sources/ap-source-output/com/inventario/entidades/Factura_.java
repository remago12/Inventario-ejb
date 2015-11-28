package com.inventario.entidades;

import com.inventario.entidades.Cajaentrada;
import com.inventario.entidades.Facturadetalle;
import com.inventario.entidades.Notacredito;
import com.inventario.entidades.Tipofactura;
import com.inventario.entidades.Tipopago;
import com.inventario.entidades.Usuario;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-11-27T20:28:36")
@StaticMetamodel(Factura.class)
public class Factura_ { 

    public static volatile ListAttribute<Factura, Notacredito> notacreditoList;
    public static volatile SingularAttribute<Factura, Tipofactura> tipofacturaId;
    public static volatile SingularAttribute<Factura, Character> estado;
    public static volatile ListAttribute<Factura, Cajaentrada> cajaentradaList;
    public static volatile SingularAttribute<Factura, Date> fecha;
    public static volatile ListAttribute<Factura, Facturadetalle> facturadetalleList;
    public static volatile SingularAttribute<Factura, String> descripcion;
    public static volatile SingularAttribute<Factura, Usuario> usuarioId;
    public static volatile SingularAttribute<Factura, Long> facturaId;
    public static volatile SingularAttribute<Factura, String> numero;
    public static volatile SingularAttribute<Factura, Tipopago> tipopagoId;

}