package com.inventario.entidades;

import com.inventario.entidades.Menu;
import com.inventario.entidades.Rol;
import com.inventario.entidades.RolmenuPK;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-11-27T20:28:36")
@StaticMetamodel(Rolmenu.class)
public class Rolmenu_ { 

    public static volatile SingularAttribute<Rolmenu, RolmenuPK> rolmenuPK;
    public static volatile SingularAttribute<Rolmenu, Character> lectura;
    public static volatile SingularAttribute<Rolmenu, Character> escritura;
    public static volatile SingularAttribute<Rolmenu, Menu> menu;
    public static volatile SingularAttribute<Rolmenu, Rol> rol;

}