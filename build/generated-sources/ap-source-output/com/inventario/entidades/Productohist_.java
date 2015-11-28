package com.inventario.entidades;

import com.inventario.entidades.Producto;
import com.inventario.entidades.ProductohistPK;
import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-11-27T20:28:36")
@StaticMetamodel(Productohist.class)
public class Productohist_ { 

    public static volatile SingularAttribute<Productohist, ProductohistPK> productohistPK;
    public static volatile SingularAttribute<Productohist, Date> fechamod;
    public static volatile SingularAttribute<Productohist, Date> fechafin;
    public static volatile SingularAttribute<Productohist, BigDecimal> valor;
    public static volatile SingularAttribute<Productohist, Character> cambio;
    public static volatile SingularAttribute<Productohist, Producto> producto;

}