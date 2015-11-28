package com.inventario.entidades;

import com.inventario.entidades.Productoinventario;
import com.inventario.entidades.Sucursal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-11-27T20:28:36")
@StaticMetamodel(Seccion.class)
public class Seccion_ { 

    public static volatile SingularAttribute<Seccion, Date> nombre;
    public static volatile SingularAttribute<Seccion, Sucursal> sucursalId;
    public static volatile SingularAttribute<Seccion, String> descripcion;
    public static volatile SingularAttribute<Seccion, Long> seccionId;
    public static volatile ListAttribute<Seccion, Productoinventario> productoinventarioList;

}