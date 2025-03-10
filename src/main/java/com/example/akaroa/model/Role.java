package com.example.akaroa.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import org.hibernate.annotations.ColumnDefault;

@Entity
@Table(name = "roles", schema = "public")
public class Role {
    @Id
    @ColumnDefault("nextval('roles_id_rol_seq')")
    @Column(name = "id_rol", nullable = false)
    private Integer id;

    @Column(name = "nombre_rol", nullable = false, length = 50)
    private String nombreRol;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombreRol() {
        return nombreRol;
    }

    public void setNombreRol(String nombreRol) {
        this.nombreRol = nombreRol;
    }

}