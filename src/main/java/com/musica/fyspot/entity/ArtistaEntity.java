package com.musica.fyspot.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "artista")
@Data
public class ArtistaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nome;
    private String generoMusical;
    private String biografia;

    public String getGeneroPrincipal() {
        return "";
    }
}