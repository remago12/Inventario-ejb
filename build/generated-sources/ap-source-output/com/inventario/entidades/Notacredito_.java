package com.inventario.entidades;

import com.inventario.entidades.Factura;
import com.inventario.entidades.Notacreditodetalle;
import com.inventario.entidades.Tiponota;
import com.inventario.entidades.Usuario;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-11-27T20:28:36")
@StaticMetamodel(Notacredito.class)
public class Notacredito_ { 

    public static volatile SingularAttribute<Notacredito, Long> notacreditoId;
    public static volatile SingularAttribute<Notacredito, Tiponota> tiponotaId;
    public static volatile ListAttribute<Notacredito, Notacreditodetalle> notacreditodetalleList;
    public static volatile SingularAttribute<Notacredito, Date> fecha;
    public static volatile SingularAttribute<Notacredito, String> descripcion;
    public static volatile SingularAttribute<Notacredito, Usuario> usuarioId;
    public static volatile SingularAttribute<Notacredito, Factura> facturaId;
    public static volatile SingularAttribute<Notacredito, String> numero;

}