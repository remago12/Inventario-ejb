package com.inventario.entidades;

import com.inventario.entidades.Compra;
import com.inventario.entidades.Factura;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-11-27T20:28:36")
@StaticMetamodel(Tipopago.class)
public class Tipopago_ { 

    public static volatile SingularAttribute<Tipopago, String> nombre;
    public static volatile ListAttribute<Tipopago, Factura> facturaList;
    public static volatile ListAttribute<Tipopago, Compra> compraList;
    public static volatile SingularAttribute<Tipopago, String> descripcion;
    public static volatile SingularAttribute<Tipopago, Long> tipopagoId;

}