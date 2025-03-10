package com.example.akaroa.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import org.hibernate.annotations.ColumnDefault;

@Entity
@Table(name = "unidades_medidas", schema = "public")
public class UnidadesMedida {
    @Id
    @ColumnDefault("nextval('unidades_medidas_id_unidad_medida_seq')")
    @Column(name = "id_unidad_medida", nullable = false)
    private Integer id;

    @Column(name = "descripcion", length = 40)
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