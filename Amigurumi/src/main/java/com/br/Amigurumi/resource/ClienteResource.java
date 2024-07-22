package com.br.Amigurumi.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.br.Amigurumi.model.Cliente;
import com.br.Amigurumi.service.ClienteService;

@RestController
@RequestMapping("/cliente")
public class ClienteResource {
	
	@Autowired
	private ClienteService clienteService;
	
	@PostMapping("/salvar")
	public Cliente salvar(@RequestBody Cliente cliente) {
		return clienteService.salvar(cliente);
	}
	
	@GetMapping("/listar")
	public List<Cliente> listar() {
		return clienteService.listarClientes();
	}
	
	@GetMapping("/teste")
	public String teste() {
		return clienteService.teste();
	}
	
}
