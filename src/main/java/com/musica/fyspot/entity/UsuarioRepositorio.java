package com.musica.fyspot.entity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepositorio {
    public interface Usuariorepositorio extends
            JpaRepository<UsuarioEntity, Integer>{

    }
}
