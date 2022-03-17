/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author Paulina Cortez, Alfredo Valenzuela
 */
@Entity
@Table(name="rel_productosventas")
public class Relacion_Productos_Ventas implements Serializable {

    @Id
    @Column(name="id_rel")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name="cantidad",nullable = false)
    private Long cantidad;
    
    @Column(name="precio",nullable = false)
    private Float precio;
    
    @Column(name="importe",nullable = false)
    private Float importe;
    
    @ManyToOne(cascade = CascadeType.REFRESH)
    @JoinColumn(name="id_venta",nullable = false)
    private Venta venta;
    
    @ManyToOne(cascade = CascadeType.REFRESH)
    @JoinColumn(name="id_producto",nullable = false)
    private Producto producto;

    public Relacion_Productos_Ventas() {
    }

    public Relacion_Productos_Ventas(Long id, Long cantidad, Float precio, Float importe, Venta venta, Producto producto) {
        this.id = id;
        this.cantidad = cantidad;
        this.precio = precio;
        this.importe = importe;
        this.venta = venta;
        this.producto = producto;
    }

    public Relacion_Productos_Ventas(Long cantidad, Float precio, Float importe, Venta venta, Producto producto) {
        this.cantidad = cantidad;
        this.precio = precio;
        this.importe = importe;
        this.venta = venta;
        this.producto = producto;
    }

    public Relacion_Productos_Ventas(Long cantidad, Float precio, Float importe, Producto producto) {
        this.cantidad = cantidad;
        this.precio = precio;
        this.importe = importe;
        this.producto = producto;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCantidad() {
        return cantidad;
    }

    public void setCantidad(Long cantidad) {
        this.cantidad = cantidad;
    }

    public Float getPrecio() {
        return precio;
    }

    public void setPrecio(Float precio) {
        this.precio = precio;
    }

    public Float getImporte() {
        return importe;
    }

    public void setImporte(Float importe) {
        this.importe = importe;
    }

    public Venta getVenta() {
        return venta;
    }

    public void setVenta(Venta venta) {
        this.venta = venta;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Relacion_Productos_Ventas)) {
            return false;
        }
        Relacion_Productos_Ventas other = (Relacion_Productos_Ventas) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.Relacion_Productos_Ventas[ id=" + id + " ]";
    }
    
}
