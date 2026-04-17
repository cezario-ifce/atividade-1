
package com.musica.fyspot.controller;

import com.Artista.fyspot.controller.ArtistaService;
import com.musica.fyspot.entity.Artista;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/artistas")
public class ArtistaController {

    @Autowired
    private ArtistaService service;

    @GetMapping("/{id}")
    public ResponseEntity<Artista> getArtista(@PathVariable Long id) {
        Artista artista = service.clone(id);
        return ResponseEntity.ok(artista);
    }
}