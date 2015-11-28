package com.inventario.entidades;

import com.inventario.entidades.Ajustedetalle;
import com.inventario.entidades.Facturadetalle;
import com.inventario.entidades.Kardex;
import com.inventario.entidades.KardexsalidaPK;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-11-27T20:28:35")
@StaticMetamodel(Kardexsalida.class)
public class Kardexsalida_ { 

    public static volatile SingularAttribute<Kardexsalida, Kardex> kardex;
    public static volatile SingularAttribute<Kardexsalida, KardexsalidaPK> kardexsalidaPK;
    public static volatile SingularAttribute<Kardexsalida, Facturadetalle> facturadetalle;
    public static volatile SingularAttribute<Kardexsalida, Ajustedetalle> ajustedetalle;
    public static volatile SingularAttribute<Kardexsalida, String> detalle;
    public static volatile SingularAttribute<Kardexsalida, Character> tiposalida;

}