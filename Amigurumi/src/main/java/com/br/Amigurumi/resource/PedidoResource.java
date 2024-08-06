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

import com.br.Amigurumi.model.Pedido;
import com.br.Amigurumi.service.PedidoService;

@RestController
@RequestMapping("/pedido")
public class PedidoResource {
	
	@Autowired
	private PedidoService pedidoService;
	
	@PostMapping("/salvar")
	public Pedido salvar(@RequestBody Pedido pedido) {
		return pedidoService.salvar(pedido);
	}
	
	@GetMapping("/listar")
	public List<Pedido> listar() {
		return pedidoService.listarClientes();
	}
	
	@DeleteMapping("/{id}")
	public void deletarClientes(@PathVariable Long id) {
		pedidoService.deletar(id);
	}
	
}
