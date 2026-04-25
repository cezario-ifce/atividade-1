package com.musica.fyspot.controller;

import com.musica.fyspot.dto.MusicaDTO;
import com.musica.fyspot.entity.ArtistaEntity;
import com.musica.fyspot.entity.MusicaEntity;
import com.musica.fyspot.services.ArtistaService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.musica.fyspot.services.MusicaService;

@RestController
@RequestMapping("/artista")
public class ArtistaController {
    private final ArtistaService artistaService;

    @GetMapping("/buscar")
    public ArtistaEntity buscarArtista(@RequestParam(name = "id")
                                     Integer id){
        return artistaService.buscar(id);
    }

    @PostMapping("/criar")
    public ResponseEntity<ArtistaEntity> addArtista(@RequestBody ArtistaEntity artista){
        return artistaService.criar(artista);
    }

    @PutMapping("/atualizar/{id}")
    public ResponseEntity<?> editarArtista(@PathVariable Integer id,
                                          @RequestBody ArtistaEntity artista){
        return artistaService.editar(id, artista);
    }

    @DeleteMapping("/apagar")
    public String apagarArtsita(@RequestParam(name = "id")
                               Integer id){
        return artistaService.deletar(id);
    }

    public ArtistaController(ArtistaService artistaService) {
        this.artistaService = artistaService;
    }
}
