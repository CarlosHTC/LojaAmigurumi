package com.br.Amigurumi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.br.Amigurumi.model.Usuario;
import com.br.Amigurumi.repository.UsuarioRepository;

@Service
public class UsuarioService {
	
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	public Usuario salvar (Usuario usuario) {
		return usuarioRepository.save(usuario);
	}
	
	public void deletar (Long id) {
		usuarioRepository.deleteById(id);
	}
	
	public List<Usuario> listarUsuario () {
		return usuarioRepository.findAll();
	}
	
//	public Usuario getUsuarioById (Long id) {
//		return usuarioRepository.findById(id); 
//	}
	
//	public Usuario editar (Usuario usuario, Long id) {
//		Usuario newUsuario = getUsuarioById(id);
		
//		return usuarioRepository.save(newUsuario);
//	}
	
}
