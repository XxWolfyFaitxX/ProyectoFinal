package com.registro.usuarios.modelo;

import javax.persistence.*;

@Entity
@Table(name = "historial_subasta")

public class HistorialSubasta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;
}
