/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.io.Serializable;
import java.security.Timestamp;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Paulina Cortez, Alfredo Valenzuela
 */
@Entity
@Table(name="ventas")
public class Venta implements Serializable {

    @Id
    @Column(name="id_venta")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name="descuento",nullable = false)
    private Float descuento;
    
    @Column(name="fecha",nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;
    
    @Column(name="montoTotal",nullable = false)
    private Float montoTotal;
    
    @ManyToOne(cascade = CascadeType.REMOVE)
    @JoinColumn(name="id_cliente",nullable = false)
    private Cliente cliente;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "venta")
    private List<Relacion_Productos_Ventas>productoVentas;

    public Venta() {
    }

    public Venta(Float descuento, Date fecha, Float montoTotal, Cliente cliente) {
        this.descuento = descuento;
        this.fecha = fecha;
        this.montoTotal = montoTotal;
        this.cliente = cliente;
    }

    public Venta(Float descuento, Date fecha, Float montoTotal) {
        this.descuento = descuento;
        this.fecha = fecha;
        this.montoTotal = montoTotal;
    }

    public Venta(Float descuento, Date fecha, Float montoTotal, Cliente cliente, List<Relacion_Productos_Ventas> productoVentas) {
        this.descuento = descuento;
        this.fecha = fecha;
        this.montoTotal = montoTotal;
        this.cliente = cliente;
        this.productoVentas = productoVentas;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Float getDescuento() {
        return descuento;
    }

    public void setDescuento(Float descuento) {
        this.descuento = descuento;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Float getMontoTotal() {
        return montoTotal;
    }

    public void setMontoTotal(Float montoTotal) {
        this.montoTotal = montoTotal;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<Relacion_Productos_Ventas> getProductoVentas() {
        return productoVentas;
    }

    public void setProductoVentas(List<Relacion_Productos_Ventas> productoVentas) {
        this.productoVentas = productoVentas;
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
        if (!(object instanceof Venta)) {
            return false;
        }
        Venta other = (Venta) object;
        return !((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id)));
    }

    @Override
    public String toString() {
        return "Venta{" + "id=" + id + ", descuento=" + descuento + ", fecha=" + fecha + ", montoTotal=" + montoTotal + '}';
    }
    
}
