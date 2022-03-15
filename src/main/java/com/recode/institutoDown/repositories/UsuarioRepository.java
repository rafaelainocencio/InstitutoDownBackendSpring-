package com.recode.institutoDown.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.recode.institutoDown.entities.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
	
}
