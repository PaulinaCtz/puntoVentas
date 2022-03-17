package entidades;

import entidades.Producto;
import entidades.Venta;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2022-03-14T20:37:18", comments="EclipseLink-2.7.9.v20210604-rNA")
@StaticMetamodel(Relacion_Productos_Ventas.class)
public class Relacion_Productos_Ventas_ { 

    public static volatile SingularAttribute<Relacion_Productos_Ventas, Float> precio;
    public static volatile SingularAttribute<Relacion_Productos_Ventas, Venta> venta;
    public static volatile SingularAttribute<Relacion_Productos_Ventas, Long> id;
    public static volatile SingularAttribute<Relacion_Productos_Ventas, Long> cantidad;
    public static volatile SingularAttribute<Relacion_Productos_Ventas, Producto> producto;
    public static volatile SingularAttribute<Relacion_Productos_Ventas, Float> importe;

}