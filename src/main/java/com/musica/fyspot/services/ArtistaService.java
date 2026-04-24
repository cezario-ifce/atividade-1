package com.musica.fyspot.services;

import com.musica.fyspot.entity.ArtistaEntity;
import com.musica.fyspot.repository.ArtistaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArtistaService {
    private final ArtistaRepository artistaRepository;

        public List<ArtistaEntity> buscar(){
            return artistaRepository.findAll();
        }

public ArtistaService(ArtistaRepository artistaRepository, ArtistaRepository artistaRepository1) {
    this.artistaRepository = artistaRepository1;
        }
}
