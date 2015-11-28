package com.inventario.entidades;

import com.inventario.entidades.Ordencompra;
import com.inventario.entidades.OrdencompradetallePK;
import com.inventario.entidades.Producto;
import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-11-27T20:28:36")
@StaticMetamodel(Ordencompradetalle.class)
public class Ordencompradetalle_ { 

    public static volatile SingularAttribute<Ordencompradetalle, String> observacion;
    public static volatile SingularAttribute<Ordencompradetalle, Ordencompra> ordencompra;
    public static volatile SingularAttribute<Ordencompradetalle, BigDecimal> cantidadreq;
    public static volatile SingularAttribute<Ordencompradetalle, Producto> productoId;
    public static volatile SingularAttribute<Ordencompradetalle, OrdencompradetallePK> ordencompradetallePK;
    public static volatile SingularAttribute<Ordencompradetalle, BigDecimal> preciounidad;
    public static volatile SingularAttribute<Ordencompradetalle, Date> fechacad;

}