package com.musica.fyspot.services;

import com.musica.fyspot.entity.ArtistaEntity;
import com.musica.fyspot.repository.ArtistaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ArtistaService {

    private final ArtistaRepository artistaRepository;

    public List<ArtistaEntity>  buscar() {
        return artistaRepository.findAll();
    }
}