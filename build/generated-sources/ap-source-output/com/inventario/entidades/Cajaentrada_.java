package com.inventario.entidades;

import com.inventario.entidades.Caja;
import com.inventario.entidades.CajaentradaPK;
import com.inventario.entidades.Factura;
import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-11-27T20:28:35")
@StaticMetamodel(Cajaentrada.class)
public class Cajaentrada_ { 

    public static volatile SingularAttribute<Cajaentrada, CajaentradaPK> cajaentradaPK;
    public static volatile SingularAttribute<Cajaentrada, String> descripcion;
    public static volatile SingularAttribute<Cajaentrada, Factura> facturaId;
    public static volatile SingularAttribute<Cajaentrada, Caja> caja;
    public static volatile SingularAttribute<Cajaentrada, BigDecimal> monto;

}