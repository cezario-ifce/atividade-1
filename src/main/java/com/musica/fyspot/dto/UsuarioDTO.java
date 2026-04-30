package com.musica.fyspot.dto;

import lombok.Data;

import java.util.Date;

@Data
public class UsuarioDTO {
    private Integer id;
    private String nome;
    private String genero;
    private String nacionalidade;
    private Date datadenacimento;
}
