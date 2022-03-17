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
@Table(name="clientes")
public class Cliente implements Serializable {

    @Id
    @Column(name="id_cliente")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     Long id;
    
    @Column(name="nombre",nullable = false,length = 45)
    private String nombre;
    
    @Column(name="direccion",nullable = false,length = 100)
    private String direccion;
    
    @Column(name="rfc",nullable = false,length = 15, unique = true)
    private String rfc;
    
    @Column(name="telefono",nullable = true,length = 15)
    private String telefono;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "cliente")
    private List<Venta>ventas;

    public Cliente() {
    }

    public Cliente(String nombre, String direccion, String rfc, String telefono) {
        this.rfc = rfc;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public Cliente(String nombre, String direccion, String rfc) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.rfc = rfc;
    }
    
    public Cliente(Long id, String nombre, String direccion, String rfc, String telefono) {
        this.id = id;
        this.direccion = direccion;
        this.nombre = nombre;
        this.rfc = rfc;
        this.telefono = telefono;
    }
    
    public Cliente(Long id, String nombre, String direccion, String rfc) {
        this.id = id;
        this.direccion = direccion;
        this.nombre = nombre;
        this.rfc = rfc;
    }
    public Cliente(String direccion, String nombre, String rfc, String telefono, List<Venta> ventas) {
        this.direccion = direccion;
        this.nombre = nombre;
        this.rfc = rfc;
        this.telefono = telefono;
        this.ventas = ventas;
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
    
    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public List<Venta> getVentas() {
        return ventas;
    }

    public void setVentas(List<Venta> ventas) {
        this.ventas = ventas;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + Objects.hashCode(this.id);
        hash = 23 * hash + Objects.hashCode(this.nombre);
        hash = 23 * hash + Objects.hashCode(this.direccion);
        hash = 23 * hash + Objects.hashCode(this.rfc);
        hash = 23 * hash + Objects.hashCode(this.telefono);
        hash = 23 * hash + Objects.hashCode(this.ventas);
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
        final Cliente other = (Cliente) obj;
        return Objects.equals(this.id, other.id);
    }

    @Override
    public String toString() {
        return "Cliente{" + "id=" + id + ", nombre=" + nombre + ", direccion=" + direccion + ", rfc=" + rfc + ", telefono=" + telefono + '}';
    }
    
}
