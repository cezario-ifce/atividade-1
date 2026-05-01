package com.musica.fyspot.controller;

import com.musica.fyspot.entity.ArtistaEntity;
import com.musica.fyspot.services.ArtistaService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/artista")
public class ArtistaController {
    private final ArtistaService artistaService;

    public ArtistaController(ArtistaService artistaService) {
        this.artistaService = artistaService;
    }

    @GetMapping("/buscar")
    public List<ArtistaEntity> buscarArtista() {
        return artistaService.buscar();
    }

    @PostMapping("/criar")
    public ResponseEntity<?> criar(@RequestBody ArtistaEntity artista) {
        try {
            ArtistaEntity novoArtista = artistaService.criar(artista);
            return ResponseEntity.status(HttpStatus.CREATED).body(novoArtista);
        } catch (RuntimeException e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
        }
    }
}