 com.musica.fyspot.services;

import com.musica.fyspot.dto.MusicaDTO;
import com.musica.fyspot.entity.ArtistaEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import com.musica.fyspot.repository.MusicaRepository;

@Service
public class ArtistaService {
    private final ArtistaRepository artistaRepository;

    public List<ArtistaEntity> buscar(){

        List<ArtistaEntity> artista = artistaRepository.findAll();
        return artista;
    }

    public ArtistaService(ArtistaRepository artistaRepository) {
        this.artistaRepository = artistaRepository;
    }
}
