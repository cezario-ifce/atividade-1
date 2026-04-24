package com.musica.fyspot.dto;

import lombok.Data;

import java.util.Date;

@Data
public class ArtistaDTO{
    private Integer Id;
    private String Nome;
    private Date dataNacimento;
    private String Genero;
    private String nacionalidade;

}
