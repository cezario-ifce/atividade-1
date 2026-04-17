package com.musica.fyspot.controller;

import com.musica.fyspot.dto.MusicaDTO;
import com.musica.fyspot.entity.MusicaEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.musica.fyspot.services.MusicaService;

@RestController
@RequestMapping("/musica")
public class MusicaController {
    private final MusicaService musicaService;

    @GetMapping("/buscar")
    public MusicaEntity buscarMusica(@RequestParam(name = "id")
                                      Integer id){
        return musicaService.buscar(id);
    }

    @PostMapping("/criar")
    public ResponseEntity<MusicaEntity> criarMusica(@RequestBody MusicaEntity musica){
        return musicaService.criar(musica);
    }

    @PutMapping("/atualizar/{id}")
    public ResponseEntity<?> editarMusica(@PathVariable Integer id,
                                          @RequestBody MusicaEntity musica){
        return musicaService.editar(id, musica);
    }

    @DeleteMapping("/apagar")
    public String apagarMusica(@RequestParam(name = "id")
                                   Integer id){
        return musicaService.deletar(id);
    }

    public MusicaController(MusicaService musicaService) {
        this.musicaService = musicaService;
    }


}


