package com.br.Amigurumi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.br.Amigurumi.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
	
}
