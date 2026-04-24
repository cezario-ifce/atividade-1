package com.musica.fyspot.entity;

import jakarta.persistence.*;

import lombok.Data;

import java.util.Date;

@Entity
@Table(name="Artistas")
@Data
public class ArtistaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id;
    private String Nome;
    private Date dataNascimento;
    private String Genero;
    private String nacionalidade;

}