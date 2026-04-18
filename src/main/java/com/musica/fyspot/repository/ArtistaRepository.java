package com.musica.fyspot.repository;

import com.musica.fyspot.entity.ArtistaEntity;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ArtistaRepository {
    public interface ArtistRepository extends
            JpaRepository<ArtistaEntity, Integer>  {

    }
}
