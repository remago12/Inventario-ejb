package com.inventario.entidades;

import com.inventario.entidades.Ajuste;
import com.inventario.entidades.AjustedetallePK;
import com.inventario.entidades.Kardexsalida;
import com.inventario.entidades.Productoinventario;
import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-11-27T20:28:36")
@StaticMetamodel(Ajustedetalle.class)
public class Ajustedetalle_ { 

    public static volatile SingularAttribute<Ajustedetalle, AjustedetallePK> ajustedetallePK;
    public static volatile ListAttribute<Ajustedetalle, Kardexsalida> kardexsalidaList;
    public static volatile SingularAttribute<Ajustedetalle, BigDecimal> cantidad;
    public static volatile SingularAttribute<Ajustedetalle, String> descripcion;
    public static volatile SingularAttribute<Ajustedetalle, Productoinventario> productoinventario;
    public static volatile SingularAttribute<Ajustedetalle, Ajuste> ajuste;

}