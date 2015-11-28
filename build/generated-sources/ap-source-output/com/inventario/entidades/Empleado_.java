package com.inventario.entidades;

import com.inventario.entidades.Cargo;
import com.inventario.entidades.Empleado;
import com.inventario.entidades.Persona;
import com.inventario.entidades.Sucursal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-11-27T20:28:35")
@StaticMetamodel(Empleado.class)
public class Empleado_ { 

    public static volatile ListAttribute<Empleado, Empleado> empleadoList;
    public static volatile SingularAttribute<Empleado, Long> empleadoId;
    public static volatile SingularAttribute<Empleado, Character> estado;
    public static volatile SingularAttribute<Empleado, Persona> personaId;
    public static volatile SingularAttribute<Empleado, Date> fechafin;
    public static volatile SingularAttribute<Empleado, Sucursal> sucursalId;
    public static volatile SingularAttribute<Empleado, Cargo> cargoId;
    public static volatile SingularAttribute<Empleado, Empleado> empleadoFk;
    public static volatile SingularAttribute<Empleado, Date> fechainicio;

}