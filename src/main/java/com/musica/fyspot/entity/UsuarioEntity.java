package com.musica.fyspot.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name="usuario")
@Data

public class UsuarioEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String Nome;
    private String Senha;
    private String email;

}
