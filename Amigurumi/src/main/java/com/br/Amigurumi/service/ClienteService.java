package com.br.Amigurumi.service;

import org.springframework.stereotype.Service;

import com.br.Amigurumi.model.Cliente;
import com.br.Amigurumi.repository.ClienteRepository;

import org.springframework.beans.factory.annotation.Autowired;


@Service
public class ClienteService {

	@Autowired
	private ClienteRepository clienteRepository;

		public Cliente salvar (Cliente cliente) {
			return clienteRepository.save(cliente);
		}
}
