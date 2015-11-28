package com.inventario.entidades;

import com.inventario.entidades.Compradetalle;
import com.inventario.entidades.Facturadetalle;
import com.inventario.entidades.Kardex;
import com.inventario.entidades.Notacreditodetalle;
import com.inventario.entidades.Ordencompradetalle;
import com.inventario.entidades.Productocategoria;
import com.inventario.entidades.Productohist;
import com.inventario.entidades.Productoinventario;
import com.inventario.entidades.Unidadmedida;
import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-11-27T20:28:35")
@StaticMetamodel(Producto.class)
public class Producto_ { 

    public static volatile SingularAttribute<Producto, Date> fechafin;
    public static volatile SingularAttribute<Producto, Unidadmedida> unidadId;
    public static volatile SingularAttribute<Producto, Character> alerta;
    public static volatile ListAttribute<Producto, Facturadetalle> facturadetalleList;
    public static volatile SingularAttribute<Producto, BigDecimal> stockmax;
    public static volatile SingularAttribute<Producto, BigDecimal> stockmin;
    public static volatile SingularAttribute<Producto, BigDecimal> costo;
    public static volatile SingularAttribute<Producto, Date> fechainicio;
    public static volatile SingularAttribute<Producto, String> codigo;
    public static volatile SingularAttribute<Producto, String> nombre;
    public static volatile SingularAttribute<Producto, BigDecimal> peso;
    public static volatile ListAttribute<Producto, Compradetalle> compradetalleList;
    public static volatile ListAttribute<Producto, Notacreditodetalle> notacreditodetalleList;
    public static volatile SingularAttribute<Producto, BigDecimal> stock;
    public static volatile SingularAttribute<Producto, BigDecimal> precio;
    public static volatile SingularAttribute<Producto, Long> productoId;
    public static volatile SingularAttribute<Producto, Productocategoria> prodcatId;
    public static volatile ListAttribute<Producto, Productohist> productohistList;
    public static volatile ListAttribute<Producto, Ordencompradetalle> ordencompradetalleList;
    public static volatile ListAttribute<Producto, Productoinventario> productoinventarioList;
    public static volatile ListAttribute<Producto, Kardex> kardexList;

}