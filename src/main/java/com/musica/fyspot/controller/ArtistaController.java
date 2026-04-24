 com.musica.fyspot.controller;

import com.musica.fyspot.dto.MusicaDTO;
import com.musica.fyspot.entity.ArtistaEntity;
import com.musica.fyspot.services.ArtistaService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.musica.fyspot.services.MusicaService;

@RestController
@RequestMapping("/Artista")
public class ArtistaController {
    private final ArtistaService artistaService;

    @GetMapping("/buscarArtista")
    public ArtistaEntity buscarArtista(@RequestParam(name = "id")
                                     Integer id){
        return artistaService.buscar();
    }

    public ArtistaController(ArtistaService artistaService) {
        this.artistaService = artistaService;
    }
}
