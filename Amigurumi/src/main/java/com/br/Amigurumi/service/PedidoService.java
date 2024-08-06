package com.br.Amigurumi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.br.Amigurumi.model.Cliente;
import com.br.Amigurumi.model.Pedido;
import com.br.Amigurumi.repository.PedidoRepository;

@Service
public class PedidoService {

	@Autowired
	private PedidoRepository pedidoRepository;
	
	public Pedido salvar (Pedido pedido) {
		return pedidoRepository.save(pedido);
	}
	
	public void deletar (Long id) {
		pedidoRepository.deleteById(id);
	}
	
	public List<Pedido> listarClientes () {
		return pedidoRepository.findAll();
	}
	
}
