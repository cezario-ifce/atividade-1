
package com.musica.fyspot.controller;

import com.musica.fyspot.entity.UsuarioEntity;
import com.musica.fyspot.services.UsuarioService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping ("/usuario")
public class UsuarioControler {
    private final UsuarioService usuarioService;

    @GetMapping("/buscar")
    public UsuarioEntity buscarUsuario(@RequestParam(name = "id")
                                        Integer id){

        return usuarioService.buscar(id);

    }
}
