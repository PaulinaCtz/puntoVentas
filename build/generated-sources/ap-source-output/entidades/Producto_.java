package entidades;

import entidades.Relacion_Productos_Ventas;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2022-03-14T20:37:18", comments="EclipseLink-2.7.9.v20210604-rNA")
@StaticMetamodel(Producto.class)
public class Producto_ { 

    public static volatile SingularAttribute<Producto, Float> precioActual;
    public static volatile ListAttribute<Producto, Relacion_Productos_Ventas> productoVentas;
    public static volatile SingularAttribute<Producto, Long> id;
    public static volatile SingularAttribute<Producto, Integer> stock;
    public static volatile SingularAttribute<Producto, String> nombre;

}