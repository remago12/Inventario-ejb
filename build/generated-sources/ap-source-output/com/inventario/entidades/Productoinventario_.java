package com.inventario.entidades;

import com.inventario.entidades.Ajustedetalle;
import com.inventario.entidades.Producto;
import com.inventario.entidades.ProductoinventarioPK;
import com.inventario.entidades.Seccion;
import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-11-27T20:28:35")
@StaticMetamodel(Productoinventario.class)
public class Productoinventario_ { 

    public static volatile SingularAttribute<Productoinventario, Date> fechamod;
    public static volatile ListAttribute<Productoinventario, Ajustedetalle> ajustedetalleList;
    public static volatile SingularAttribute<Productoinventario, BigDecimal> cantidad;
    public static volatile SingularAttribute<Productoinventario, Producto> producto;
    public static volatile SingularAttribute<Productoinventario, Seccion> seccion;
    public static volatile SingularAttribute<Productoinventario, ProductoinventarioPK> productoinventarioPK;

}