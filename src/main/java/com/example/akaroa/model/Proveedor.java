package com.example.akaroa.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import org.hibernate.annotations.ColumnDefault;

import java.time.LocalDate;

@Entity
@Table(name = "proveedores", schema = "public")
public class Proveedor {
    @Id
    @ColumnDefault("nextval('proveedores_id_proveedor_seq')")
    @Column(name = "id_proveedor", nullable = false)
    private Integer id;

    @Column(name = "nombre_proveedor", nullable = false, length = 100)
    private String nombreProveedor;

    @Column(name = "telefono", length = 20)
    private String telefono;

    @Column(name = "direccion", length = 100)
    private String direccion;

    @ColumnDefault("'activo'")
    @Column(name = "estado", length = 20)
    private String estado;

    @ColumnDefault("CURRENT_DATE")
    @Column(name = "fecha_registro")
    private LocalDate fechaRegistro;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombreProveedor() {
        return nombreProveedor;
    }

    public void setNombreProveedor(String nombreProveedor) {
        this.nombreProveedor = nombreProveedor;
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

    public LocalDate getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(LocalDate fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

}