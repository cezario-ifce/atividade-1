package com.musica.fyspot.dto;

import lombok.Data;

import java.util.Date;

@Data
public class ArtistaDTO {
    private String nome;
    private String nacionalidade;
    private Date data_nascimento;
}
