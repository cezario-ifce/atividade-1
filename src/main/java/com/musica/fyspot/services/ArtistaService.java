package com.musica.fyspot.services;

import com.musica.fyspot.entity.ArtistaEntity;
import com.musica.fyspot.repository.ArtistaRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class ArtistaService {
    private final ArtistaRepository artistaRepository;

    public ArtistaEntity buscar(Integer id) {
        return artistaRepository.findById(id).orElse(null);
    }

    public ResponseEntity<ArtistaEntity> criar(ArtistaEntity artista) {
        ArtistaEntity entity = artistaRepository.save(artista);
        return ResponseEntity.status(HttpStatus.CREATED).body(entity);
    }

    public ResponseEntity<?> editar(Integer id, ArtistaEntity artistaAtualizado) {
        try {
            ArtistaEntity artista = artistaRepository.findById(id).orElseThrow(() ->
                    new RuntimeException("Artista não encontrado"));

            if (artistaAtualizado.getNome() != null) {
                artista.setNome(artistaAtualizado.getNome());
            }
            if (artistaAtualizado.getGeneroPrincipal() != null) {
                artista.setGeneroMusical(artistaAtualizado.getGeneroPrincipal());
            }
            if (artistaAtualizado.getBiografia() != null) {
                artista.setBiografia(artistaAtualizado.getBiografia());
            }

            artistaRepository.save(artista);
            return ResponseEntity.ok(artista);

        } catch (RuntimeException e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(e.getMessage());
        }
    }

    public String deletar(Integer id) {
        try {
            artistaRepository.findById(id).orElseThrow(() ->
                    new RuntimeException("Artista não encontrado"));

            artistaRepository.deleteById(id);
            return "Artista deletado";
        } catch (RuntimeException e) {
            return e.getMessage();
        }
    }

    public ArtistaService(ArtistaRepository artistaRepository) {
        this.artistaRepository = artistaRepository;
    }
}