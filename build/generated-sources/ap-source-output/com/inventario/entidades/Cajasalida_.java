package com.inventario.entidades;

import com.inventario.entidades.Caja;
import com.inventario.entidades.CajasalidaPK;
import com.inventario.entidades.Usuario;
import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-11-27T20:28:35")
@StaticMetamodel(Cajasalida.class)
public class Cajasalida_ { 

    public static volatile SingularAttribute<Cajasalida, String> descripcion;
    public static volatile SingularAttribute<Cajasalida, CajasalidaPK> cajasalidaPK;
    public static volatile SingularAttribute<Cajasalida, Usuario> usuarioId;
    public static volatile SingularAttribute<Cajasalida, Caja> caja;
    public static volatile SingularAttribute<Cajasalida, BigDecimal> monto;

}