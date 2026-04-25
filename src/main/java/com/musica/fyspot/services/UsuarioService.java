package com.musica.fyspot.services;

import com.musica.fyspot.entity.ArtistaEntity;
import com.musica.fyspot.entity.MusicaEntity;
import com.musica.fyspot.entity.UsuarioEntity;
import com.musica.fyspot.repository.UsuarioRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UsuarioService {

    private final UsuarioRepository usuarioRepository;

    public UsuarioEntity buscar(Integer id){

        UsuarioEntity usario = usuarioRepository.
                findById(id).orElse(null);

        return  usario;
    }
}
