package com.musica.fyspot.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Table(name="artista")
@Data

public class ArtistaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String  nome;
    private String  nacionalidade;
    private Date datanacimento;

}
