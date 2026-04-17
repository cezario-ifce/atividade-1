package com.musica.fyspot.entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "artistas")
public class ArtistaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String Nome ;
    private Date dataNascimento;
    private String Nacionalidade;
}



//public Artista(String nome, String Nacionalidade) {
  //  this.n
}


