package com.inventario.entidades;

import com.inventario.entidades.KardexPK;
import com.inventario.entidades.Kardexentrada;
import com.inventario.entidades.Kardexsalida;
import com.inventario.entidades.Producto;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-11-27T20:28:36")
@StaticMetamodel(Kardex.class)
public class Kardex_ { 

    public static volatile ListAttribute<Kardex, Kardexsalida> kardexsalidaList;
    public static volatile SingularAttribute<Kardex, Character> estado;
    public static volatile SingularAttribute<Kardex, String> descripcion;
    public static volatile SingularAttribute<Kardex, Producto> producto;
    public static volatile ListAttribute<Kardex, Kardexentrada> kardexentradaList;
    public static volatile SingularAttribute<Kardex, KardexPK> kardexPK;

}