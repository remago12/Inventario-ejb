package com.inventario.entidades;

import com.inventario.entidades.Compradetalle;
import com.inventario.entidades.Kardex;
import com.inventario.entidades.KardexentradaPK;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-11-27T20:28:36")
@StaticMetamodel(Kardexentrada.class)
public class Kardexentrada_ { 

    public static volatile SingularAttribute<Kardexentrada, Kardex> kardex;
    public static volatile SingularAttribute<Kardexentrada, String> detalle;
    public static volatile SingularAttribute<Kardexentrada, KardexentradaPK> kardexentradaPK;
    public static volatile SingularAttribute<Kardexentrada, Compradetalle> compradetalle;

}