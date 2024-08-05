package com.br.Amigurumi.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.br.Amigurumi.model.Usuario;
import com.br.Amigurumi.service.UsuarioService;

@RestController
@RequestMapping("/usuario")
public class UsuarioResource {
	
	@Autowired
	private UsuarioService usuarioService;
	
	@PostMapping("/salvar")
	public Usuario salvar (@RequestBody Usuario usuario) {
		return usuarioService.salvar(usuario);
	}
	
	@GetMapping("/listar")
	public List<Usuario> listarProdutos() {
		return usuarioService.listarUsuario();
	}
	
	@DeleteMapping("/{id}")
	public void deletarProduo(@PathVariable Long id) {
		usuarioService.deletar(id);
	}
	
}
