package com.inventario.entidades;

import com.inventario.entidades.Notacredito;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-11-27T20:28:36")
@StaticMetamodel(Tiponota.class)
public class Tiponota_ { 

    public static volatile SingularAttribute<Tiponota, String> nombre;
    public static volatile ListAttribute<Tiponota, Notacredito> notacreditoList;
    public static volatile SingularAttribute<Tiponota, Long> tiponotaId;
    public static volatile SingularAttribute<Tiponota, String> descripcion;

}