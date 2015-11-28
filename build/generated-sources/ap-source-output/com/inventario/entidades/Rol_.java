package com.inventario.entidades;

import com.inventario.entidades.Rolmenu;
import com.inventario.entidades.Usuario;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-11-27T20:28:35")
@StaticMetamodel(Rol.class)
public class Rol_ { 

    public static volatile SingularAttribute<Rol, String> nombre;
    public static volatile SingularAttribute<Rol, Long> rolId;
    public static volatile ListAttribute<Rol, Usuario> usuarioList;
    public static volatile SingularAttribute<Rol, String> descripcion;
    public static volatile ListAttribute<Rol, Rolmenu> rolmenuList;

}