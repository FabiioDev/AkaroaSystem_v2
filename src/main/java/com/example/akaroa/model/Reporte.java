package com.example.akaroa.model;

import jakarta.persistence.*;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import java.time.LocalDate;

@Entity
@Table(name = "reportes", schema = "public")
public class Reporte {
    @Id
    @ColumnDefault("nextval('reportes_id_reporte_seq')")
    @Column(name = "id_reporte", nullable = false)
    private Integer id;

    @Column(name = "tipo_reporte", nullable = false, length = 50)
    private String tipoReporte;

    @ColumnDefault("CURRENT_DATE")
    @Column(name = "fecha_generacion")
    private LocalDate fechaGeneracion;

    @Column(name = "contenido", length = Integer.MAX_VALUE)
    private String contenido;

    @ManyToOne(fetch = FetchType.LAZY)
    @OnDelete(action = OnDeleteAction.SET_NULL)
    @JoinColumn(name = "id_usuario")
    private com.example.akaroa.model.Usuario idUsuario;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTipoReporte() {
        return tipoReporte;
    }

    public void setTipoReporte(String tipoReporte) {
        this.tipoReporte = tipoReporte;
    }

    public LocalDate getFechaGeneracion() {
        return fechaGeneracion;
    }

    public void setFechaGeneracion(LocalDate fechaGeneracion) {
        this.fechaGeneracion = fechaGeneracion;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public com.example.akaroa.model.Usuario getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(com.example.akaroa.model.Usuario idUsuario) {
        this.idUsuario = idUsuario;
    }

}