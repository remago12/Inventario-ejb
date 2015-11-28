package com.inventario.entidades;

import com.inventario.entidades.Menu;
import com.inventario.entidades.Rolmenu;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-11-27T20:28:35")
@StaticMetamodel(Menu.class)
public class Menu_ { 

    public static volatile SingularAttribute<Menu, String> nombre;
    public static volatile SingularAttribute<Menu, Menu> menuFk;
    public static volatile SingularAttribute<Menu, String> icono;
    public static volatile SingularAttribute<Menu, String> descripcion;
    public static volatile SingularAttribute<Menu, Long> menuId;
    public static volatile ListAttribute<Menu, Menu> menuList;
    public static volatile ListAttribute<Menu, Rolmenu> rolmenuList;
    public static volatile SingularAttribute<Menu, String> url;

}