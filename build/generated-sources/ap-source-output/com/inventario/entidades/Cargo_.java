package com.inventario.entidades;

import com.inventario.entidades.Empleado;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-11-27T20:28:36")
@StaticMetamodel(Cargo.class)
public class Cargo_ { 

    public static volatile SingularAttribute<Cargo, String> nombre;
    public static volatile ListAttribute<Cargo, Empleado> empleadoList;
    public static volatile SingularAttribute<Cargo, Long> cargoId;
    public static volatile SingularAttribute<Cargo, String> descripcion;

}