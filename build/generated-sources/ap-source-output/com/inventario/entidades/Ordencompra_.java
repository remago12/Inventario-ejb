package com.inventario.entidades;

import com.inventario.entidades.Compra;
import com.inventario.entidades.Ordencompradetalle;
import com.inventario.entidades.Proveedor;
import com.inventario.entidades.Usuario;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-11-27T20:28:36")
@StaticMetamodel(Ordencompra.class)
public class Ordencompra_ { 

    public static volatile SingularAttribute<Ordencompra, Long> ordencompraId;
    public static volatile SingularAttribute<Ordencompra, Date> fechaorden;
    public static volatile SingularAttribute<Ordencompra, Character> estado;
    public static volatile SingularAttribute<Ordencompra, Proveedor> proveedorId;
    public static volatile SingularAttribute<Ordencompra, Date> fecharevision;
    public static volatile ListAttribute<Ordencompra, Compra> compraList;
    public static volatile SingularAttribute<Ordencompra, String> descripcion;
    public static volatile ListAttribute<Ordencompra, Ordencompradetalle> ordencompradetalleList;
    public static volatile SingularAttribute<Ordencompra, Usuario> usuarioId;
    public static volatile SingularAttribute<Ordencompra, String> numero;

}