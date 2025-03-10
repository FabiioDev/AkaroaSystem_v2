package com.example.akaroa.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import org.hibernate.annotations.ColumnDefault;

@Entity
@Table(name = "clientes", schema = "public")
public class Cliente {
    @Id
    @ColumnDefault("nextval('clientes_id_cliente_seq')")
    @Column(name = "id_cliente", nullable = false)
    private Integer id;

    @Column(name = "nombre_cliente", nullable = false, length = 100)
    private String nombreCliente;

    @Column(name = "telefono", length = 20)
    private String telefono;

    @Column(name = "direccion")
    private String direccion;

    @ColumnDefault("'activo'")
    @Column(name = "estado", length = 20)
    private String estado;

    @Column(name = "historial_compras", length = Integer.MAX_VALUE)
    private String historialCompras;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getHistorialCompras() {
        return historialCompras;
    }

    public void setHistorialCompras(String historialCompras) {
        this.historialCompras = historialCompras;
    }

}