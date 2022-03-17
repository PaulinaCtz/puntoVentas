/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Paulina Cortez, Alfredo Valenzuela
 */
@Entity
@Table(name="productos")
public class Producto implements Serializable {

    @Id
    @Column(name="id_producto")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name="name",nullable = false,length = 100)
    private String nombre;
    
    @Column(name="precioactual",nullable = false )
    private Float precioActual;
    
    @Column(name="stock",nullable = false )
    private Integer stock;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "producto")
    private List<Relacion_Productos_Ventas>productoVentas;

    public Producto() {
    }

    public Producto(Long id, String nombre, Float precioActual, Integer stock, List<Relacion_Productos_Ventas> productoVentas) {
        this.id = id;
        this.nombre = nombre;
        this.precioActual = precioActual;
        this.stock = stock;
        this.productoVentas = productoVentas;
    }

    public Producto(String nombre, Float precioActual, Integer stock, List<Relacion_Productos_Ventas> productoVentas) {
        this.nombre = nombre;
        this.precioActual = precioActual;
        this.stock = stock;
        this.productoVentas = productoVentas;
    }

    public Producto(String nombre, Float precioActual, Integer stock) {
        this.nombre = nombre;
        this.precioActual = precioActual;
        this.stock = stock;
    }

    public Producto(Long id, String nombre, Float precioActual, Integer stock) {
        this.id = id;
        this.nombre = nombre;
        this.precioActual = precioActual;
        this.stock = stock;
    }
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Float getPrecioActual() {
        return precioActual;
    }

    public void setPrecioActual(Float precioActual) {
        this.precioActual = precioActual;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public List<Relacion_Productos_Ventas> getProductoVentas() {
        return productoVentas;
    }

    public void setProductoVentas(List<Relacion_Productos_Ventas> productoVentas) {
        this.productoVentas = productoVentas;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 29 * hash + Objects.hashCode(this.id);
        hash = 29 * hash + Objects.hashCode(this.nombre);
        hash = 29 * hash + Objects.hashCode(this.precioActual);
        hash = 29 * hash + Objects.hashCode(this.stock);
        hash = 29 * hash + Objects.hashCode(this.productoVentas);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Producto other = (Producto) obj;
        return Objects.equals(this.id, other.id);
    }

    @Override
    public String toString() {
        return "Producto{" + "id=" + id + ", nombre=" + nombre + ", precioActual=" + precioActual + ", stock=" + stock + '}';
    }
    
}
