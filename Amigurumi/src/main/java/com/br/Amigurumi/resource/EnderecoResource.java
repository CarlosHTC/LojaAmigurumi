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

import com.br.Amigurumi.model.Endereco;
import com.br.Amigurumi.service.EnderecoService;

@RestController
@RequestMapping("/endereco")
public class EnderecoResource {

	@Autowired
	private EnderecoService enderecoService;
	
	@PostMapping("/salvar")
	public Endereco salvar(@RequestBody Endereco endereco) {
		return enderecoService.salvar(endereco);
	}
	
	@GetMapping("/listar")
	public List<Endereco> listar() {
		return enderecoService.listarClientes();
	}
	
	@DeleteMapping("/{id}")
	public void deletarClientes(@PathVariable Long id) {
		enderecoService.deletar(id);
	}
}
