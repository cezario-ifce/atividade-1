import com.musica.fyspot.entity.Artista;
import com.musica.fyspot.repository.ArtistaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArtistaService {

    @Autowired
    private ArtistaRepository repository;

    public List<Artista> listarTodos() {
        return repository.findAll();
    }

    public Artista buscarPorId(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Artista com ID " + id + " não encontrado."));
    }
}