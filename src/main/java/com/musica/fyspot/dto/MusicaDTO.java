package com.musica.fyspot.dto;

import lombok.Data;

import java.util.Date;

@Data
public class MusicaDTO {
    private String nome;
    private String artista;
    private String genero;
    private Date dataLancamento;
}
