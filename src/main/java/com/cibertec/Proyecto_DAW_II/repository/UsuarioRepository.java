package com.cibertec.Proyecto_DAW_II.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.cibertec.Proyecto_DAW_II.entity.Usuario;

import java.util.Optional;


public interface UsuarioRepository extends JpaRepository<Usuario ,Long> {


   Optional<Usuario> findByUserName(String username);
}
