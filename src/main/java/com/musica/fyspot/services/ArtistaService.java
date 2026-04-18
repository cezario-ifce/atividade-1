package com.musica.fyspot.services;

import com.musica.fyspot.dto.MusicaDTO;
import com.musica.fyspot.entity.ArtistaEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.artistaEntity;
import org.springframework.stereotype.Service;
import com.musica.fyspot.repository.ArtistaRepository;

@Service
public class ArtistaService {
    private final ArtistaRepository artistaRepository;

    public ArtistaEntity buscar(Integer id){

        ArtistaEntity artista = artistaRepository.
                findById(id).orElse(null);
        return  artista;
    }

    public artistaEntity<ArtistaEntity> criar(ArtistaEntity artista){
        MusicaEntity entity = musicaRepository.save(musica);

        return ResponseEntity.status(HttpStatus.CREATED).body(entity);
    }

    public ResponseEntity<?> editar(Integer id, MusicaEntity musicaAtualizada){
        try{
            MusicaEntity musica = musicaRepository.findById(id).orElseThrow(() ->
                    new RuntimeException("Musica não encontrada"));

            if (musicaAtualizada.getNome() != null){
                musica.setNome(musicaAtualizada.getNome());
            }

            if (musicaAtualizada.getArtista() != null){
                musica.setArtista(musicaAtualizada.getArtista());
            }
            if (musicaAtualizada.getGenero() != null){
                musica.setGenero(musicaAtualizada.getGenero());
            }
            if (musicaAtualizada.getDataLancamento() != null){
                musica.setDataLancamento(musicaAtualizada.getDataLancamento());
            }

            musicaRepository.save(musica);

            return ResponseEntity.ok(musica);

        } catch (RuntimeException e){
            return ResponseEntity.status(HttpStatus.NO_CONTENT).body(e.getMessage());
        }
    }

    public String deletar(Integer id){
        String mensagem;
        try{
            musicaRepository.findById(id).orElseThrow(() ->
                    new RuntimeException("Musica não encontrada"));

            musicaRepository.deleteById(id);
            mensagem = "Musica deletada";

            return mensagem ;
        } catch (RuntimeException e){
            return e.getMessage();
        }

    }

    public MusicaService(MusicaRepository musicaRepository) {
        this.musicaRepository = musicaRepository;
    }
}
