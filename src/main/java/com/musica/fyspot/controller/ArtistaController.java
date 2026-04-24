package com.musica.fyspot.controller;

import com.musica.fyspot.entity.ArtistaEntity;
import com.musica.fyspot.services.ArtistaService;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Service
@RequestMapping("/Artista")
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