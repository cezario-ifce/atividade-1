package com.musica.fyspot.services;

import com.musica.fyspot.entity.ArtistaEntity;
import com.musica.fyspot.entity.MusicaEntity;
import com.musica.fyspot.repository.ArtistaRepository;
import com.musica.fyspot.repository.MusicaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;


@Service
public class ArtistaService {
    private final ArtistaRepository artistaRepository;

    public ArtistaEntity buscar(Integer id){

        ArtistaEntity artista = artistaRepository.
                findById(id).orElse(null);

        return artista;
    }

    public ResponseEntity<ArtistaEntity> criar(ArtistaEntity artista){
        ArtistaEntity entity = artistaRepository.save(artista);

        return ResponseEntity.status(HttpStatus.CREATED).body(entity);
    }

    public ResponseEntity<?> editar(Integer id, ArtistaEntity artistaAtualizado){
        try{
            ArtistaEntity artista = artistaRepository.findById(id).orElseThrow(() ->
                    new RuntimeException("Artista não encontrada"));

            if (artistaAtualizado.getNome() != null){
                artista.setNome(artistaAtualizado.getNome());
            }

            if (artistaAtualizado.getId() != null){
                artista.setId(artistaAtualizado.getId());
            }
            if (artistaAtualizado.getNacionalidade() != null){
                artista.setNacionalidade(artistaAtualizado.getNacionalidade());
            }
            if (artistaAtualizado.getDatanacimento() != null){
                artista.setDatanacimento(artistaAtualizado.getDatanacimento());
            }

            artistaRepository.save(artista);

            return ResponseEntity.ok(artista);

        } catch (RuntimeException e){
            return ResponseEntity.status(HttpStatus.NO_CONTENT).body(e.getMessage());
        }
    }

    public String deletar(Integer id){
        String mensagem;
        try{
            artistaRepository.findById(id).orElseThrow(() ->
                    new RuntimeException("Artista não encontrada"));

            artistaRepository.deleteById(id);
            mensagem = "Artista deletada";

            return mensagem ;
        } catch (RuntimeException e){
            return e.getMessage();
        }

    }

    public ArtistaService(ArtistaRepository artistaRepository) {
        this.artistaRepository = artistaRepository;
    }


}
