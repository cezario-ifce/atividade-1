package com.musica.fyspot.controller;

import com.musica.fyspot.entity.ArtistaEntity;
import com.musica.fyspot.services.ArtistaService;
import com.musica.fyspot.dto.ArtistaDTO;
import com.musica.fyspot.entity.ArtistaEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.musica.fyspot.services.ArtistaService;



import com.musica.fyspot.entity.ArtistaEntity;
import com.musica.fyspot.services.ArtistaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/artistas")
public class ArtistaController {

    private final ArtistaService artistaService;


    public ArtistaController(ArtistaService artistaService) {
        this.artistaService = artistaService;
    }

    @GetMapping("/buscar")
    public List<ArtistaEntity> buscarArtista() {
        return artistaService.buscar();
    }
}