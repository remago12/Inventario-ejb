package com.inventario.entidades;

import com.inventario.entidades.Ajustedetalle;
import com.inventario.entidades.Usuario;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-11-27T20:28:36")
@StaticMetamodel(Ajuste.class)
public class Ajuste_ { 

    public static volatile SingularAttribute<Ajuste, Date> fecha;
    public static volatile ListAttribute<Ajuste, Ajustedetalle> ajustedetalleList;
    public static volatile SingularAttribute<Ajuste, String> tipo;
    public static volatile SingularAttribute<Ajuste, String> descripcion;
    public static volatile SingularAttribute<Ajuste, Long> ajusteId;
    public static volatile SingularAttribute<Ajuste, Usuario> usuarioId;

}