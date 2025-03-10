package com.example.akaroa.model;

import jakarta.persistence.*;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import java.time.LocalDate;

@Entity
@Table(name = "compras", schema = "public")
public class Compra {
    @Id
    @ColumnDefault("nextval('compras_id_compra_seq')")
    @Column(name = "id_compra", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    @OnDelete(action = OnDeleteAction.SET_NULL)
    @JoinColumn(name = "id_proveedor")
    private Proveedor idProveedor;

    @ColumnDefault("CURRENT_DATE")
    @Column(name = "fecha_compra")
    private LocalDate fechaCompra;

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

    public Proveedor getIdProveedor() {
        return idProveedor;
    }

    public void setIdProveedor(Proveedor idProveedor) {
        this.idProveedor = idProveedor;
    }

    public LocalDate getFechaCompra() {
        return fechaCompra;
    }

    public void setFechaCompra(LocalDate fechaCompra) {
        this.fechaCompra = fechaCompra;
    }

    public com.example.akaroa.model.Usuario getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(com.example.akaroa.model.Usuario idUsuario) {
        this.idUsuario = idUsuario;
    }

}