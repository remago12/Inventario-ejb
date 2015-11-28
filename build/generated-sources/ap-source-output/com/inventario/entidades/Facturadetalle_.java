package com.inventario.entidades;

import com.inventario.entidades.Factura;
import com.inventario.entidades.FacturadetallePK;
import com.inventario.entidades.Kardexsalida;
import com.inventario.entidades.Producto;
import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-11-27T20:28:35")
@StaticMetamodel(Facturadetalle.class)
public class Facturadetalle_ { 

    public static volatile ListAttribute<Facturadetalle, Kardexsalida> kardexsalidaList;
    public static volatile SingularAttribute<Facturadetalle, Factura> factura;
    public static volatile SingularAttribute<Facturadetalle, BigDecimal> cantidad;
    public static volatile SingularAttribute<Facturadetalle, Producto> productoId;
    public static volatile SingularAttribute<Facturadetalle, FacturadetallePK> facturadetallePK;
    public static volatile SingularAttribute<Facturadetalle, BigDecimal> preciounidad;

}