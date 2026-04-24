package com.musica.fyspot.repository;

import com.musica.fyspot.entity.MusicaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArtistaRepository extends JpaRepository<ArtistaRepository, Integer> {
}

