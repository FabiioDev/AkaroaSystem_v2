package com.example.akaroa.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import org.hibernate.annotations.ColumnDefault;

@Entity
@Table(name = "categorias", schema = "public")
public class Categoria {
    @Id
    @ColumnDefault("nextval('categorias_id_categoria_seq')")
    @Column(name = "id_categoria", nullable = false)
    private Integer id;

    @Column(name = "descripcion", length = 60)
    private String descripcion;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

}