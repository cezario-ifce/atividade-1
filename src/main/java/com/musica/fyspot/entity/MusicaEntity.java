package com.musica.fyspot.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;


@Entity
@Table(name="musicas")
@Data
public class MusicaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nome;
    private String artista;
    private String genero;
    private Date dataLancamento;
}
