package com.inventario.entidades;

import com.inventario.entidades.Notacredito;
import com.inventario.entidades.NotacreditodetallePK;
import com.inventario.entidades.Producto;
import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-11-27T20:28:35")
@StaticMetamodel(Notacreditodetalle.class)
public class Notacreditodetalle_ { 

    public static volatile SingularAttribute<Notacreditodetalle, NotacreditodetallePK> notacreditodetallePK;
    public static volatile SingularAttribute<Notacreditodetalle, BigDecimal> cantidad;
    public static volatile SingularAttribute<Notacreditodetalle, Producto> productoId;
    public static volatile SingularAttribute<Notacreditodetalle, BigDecimal> preciounidad;
    public static volatile SingularAttribute<Notacreditodetalle, Notacredito> notacredito;

}