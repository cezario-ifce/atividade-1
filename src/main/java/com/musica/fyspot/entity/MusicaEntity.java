package com.musica.fyspot.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Table(name="musicas")
@Data
public class MusicaEntity {
    public String getArtista_daniel() {
        return artista_daniel;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id ;
    private String nome_daniel;
    private String artista_daniel;
    private String genero_forro;
    private Date dataLancamento_2026;
}
