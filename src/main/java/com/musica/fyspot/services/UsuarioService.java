package com.musica.fyspot.services;

import com.musica.fyspot.entity.UsuarioEntitty;
import com.musica.fyspot.repository.UsuarioRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UsuarioService {
    private final UsuarioRepository usuarioRepository;

    public UsuarioEntitty buscar(Integer id){
        UsuarioEntitty usuario = usuarioRepository.
                findById(id).orElse(null);
        return  usuario;

    }
}
