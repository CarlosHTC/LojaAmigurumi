package com.br.Amigurumi.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;

import com.br.Amigurumi.model.Cliente;
import com.br.Amigurumi.service.ClienteService;

public class ClienteResource {
	
	@Autowired
	private ClienteService clienteService;
	
	@PostMapping("/salvar")
	public Cliente salvar(Cliente cliente) {
		return clienteService.salvar(cliente);
	}
}
