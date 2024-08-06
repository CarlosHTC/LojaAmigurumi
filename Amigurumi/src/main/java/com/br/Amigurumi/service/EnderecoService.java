package com.br.Amigurumi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.br.Amigurumi.model.Cliente;
import com.br.Amigurumi.model.Endereco;
import com.br.Amigurumi.repository.EnderecoRepository;

@Service
public class EnderecoService {
	
	@Autowired
	private EnderecoRepository enderecoRepository;
	
	public Endereco salvar (Endereco endereco) {
		return enderecoRepository.save(endereco);
	}
	
	public void deletar (Long id) {
		enderecoRepository.deleteById(id);
	}
	
	public List<Endereco> listarClientes () {
		return enderecoRepository.findAll();
	}
	
	public String teste () {
		return "TESTE";
	}
}
