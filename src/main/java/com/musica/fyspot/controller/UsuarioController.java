package com.musica.fyspot.controller;

import com.musica.fyspot.dto.MusicaDTO;
import com.musica.fyspot.entity.UsuarioEntity;
import com.musica.fyspot.services.UsuarioService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.musica.fyspot.services.UsuarioService;

@RestController
@RequestMapping("/musica")
public class UsuarioController {
    private final UsuarioService usuarioService;

    @GetMapping("/buscar")
    public UsuarioEntity buscarUsuario(@RequestParam(name = "id")
                                     Integer id){
        return usuarioService.buscar(id);
    }

    public UsuarioController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }
}
