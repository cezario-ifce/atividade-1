package com.musica.fyspot.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table
@Data
public class UsuarioEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nomeUsuario;
    private String senha;
    private String email;

}
