package com.inventario.entidades;

import com.inventario.entidades.Documento;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-11-27T20:28:35")
@StaticMetamodel(Documentotipo.class)
public class Documentotipo_ { 

    public static volatile SingularAttribute<Documentotipo, String> nombre;
    public static volatile SingularAttribute<Documentotipo, Short> mascara;
    public static volatile SingularAttribute<Documentotipo, Long> doctipoId;
    public static volatile SingularAttribute<Documentotipo, String> descripcion;
    public static volatile ListAttribute<Documentotipo, Documento> documentoList;

}