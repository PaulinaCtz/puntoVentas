package entidades;

import entidades.Cliente;
import entidades.Relacion_Productos_Ventas;
import java.util.Date;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2022-03-14T20:37:18", comments="EclipseLink-2.7.9.v20210604-rNA")
@StaticMetamodel(Venta.class)
public class Venta_ { 

    public static volatile SingularAttribute<Venta, Date> fecha;
    public static volatile SingularAttribute<Venta, Cliente> cliente;
    public static volatile ListAttribute<Venta, Relacion_Productos_Ventas> productoVentas;
    public static volatile SingularAttribute<Venta, Float> descuento;
    public static volatile SingularAttribute<Venta, Long> id;
    public static volatile SingularAttribute<Venta, Float> montoTotal;

}