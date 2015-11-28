package com.inventario.entidades;

import com.inventario.entidades.CajaPK;
import com.inventario.entidades.Cajaentrada;
import com.inventario.entidades.Cajasalida;
import com.inventario.entidades.Sucursal;
import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-11-27T20:28:36")
@StaticMetamodel(Caja.class)
public class Caja_ { 

    public static volatile SingularAttribute<Caja, Sucursal> sucursal;
    public static volatile ListAttribute<Caja, Cajaentrada> cajaentradaList;
    public static volatile SingularAttribute<Caja, CajaPK> cajaPK;
    public static volatile ListAttribute<Caja, Cajasalida> cajasalidaList;
    public static volatile SingularAttribute<Caja, BigDecimal> montofinal;
    public static volatile SingularAttribute<Caja, String> descripcion;
    public static volatile SingularAttribute<Caja, BigDecimal> montoinicial;

}