package com.musica.fyspot.repository;

import com.musica.fyspot.entity.MusicaEntity;
import com.musica.fyspot.entity.UsuarioEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends
        JpaRepository<UsuarioEntity, Integer> {
}
