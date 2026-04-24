package com.musica.fyspot.services;

import com.musica.fyspot.entity.UsuarioEntity;
import com.musica.fyspot.repository.UsuarioRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UsuarioService {
    private final UsuarioRepository usuarioRepository;

    public UsuarioEntity buscar(Integer id){
        UsuarioEntity usuario = usuarioRepository.
                findById(id).orElse(null);
        return  usuario;

    }
}
