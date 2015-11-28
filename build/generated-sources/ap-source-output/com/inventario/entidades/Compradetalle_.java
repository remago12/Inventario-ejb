package com.inventario.entidades;

import com.inventario.entidades.Compra;
import com.inventario.entidades.CompradetallePK;
import com.inventario.entidades.Kardexentrada;
import com.inventario.entidades.Producto;
import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-11-27T20:28:35")
@StaticMetamodel(Compradetalle.class)
public class Compradetalle_ { 

    public static volatile SingularAttribute<Compradetalle, Compra> compra;
    public static volatile SingularAttribute<Compradetalle, BigDecimal> cantidad;
    public static volatile SingularAttribute<Compradetalle, Producto> productoId;
    public static volatile SingularAttribute<Compradetalle, BigDecimal> preciounidad;
    public static volatile SingularAttribute<Compradetalle, CompradetallePK> compradetallePK;
    public static volatile ListAttribute<Compradetalle, Kardexentrada> kardexentradaList;

}