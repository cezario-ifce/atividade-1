package com.musica.fyspot.entity;

import jakarta.persistence.*;
import lombok.Data;
@Entity
@Table (name = "Usuario")
@Data
public class UsuarioEntitty {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nomeUsuario;
    private String senha;
    private String email;

}
