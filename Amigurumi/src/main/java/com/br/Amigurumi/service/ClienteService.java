package com.br.Amigurumi.service;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.br.Amigurumi.model.Cliente;
import com.br.Amigurumi.repository.ClienteRepository;



@Service
public class ClienteService {

	@Autowired
	private ClienteRepository clienteRepository;

		public Cliente salvar (Cliente cliente) {
			return clienteRepository.save(cliente);
		}
		
		public void deletar (Long id) {
			clienteRepository.deleteById(id);
		}
		
		public List<Cliente> listarClientes () {
			return clienteRepository.findAll();
		}
		
		public Cliente buscarPeloCodigo (Long codigo){
			Cliente clienteSalvo = clienteRepository.findById(codigo).get();
			if(clienteSalvo != null) {
				return null;
			}
			return clienteSalvo;
		}
		
		public Cliente atualizar (Long codigo, Cliente cliente) {
			Cliente clienteSalvo = buscarPeloCodigo(codigo);
			BeanUtils.copyProperties(cliente, clienteSalvo, "IDEN_CLIENTE");
			return clienteRepository.save(clienteSalvo);
		}
		
		public String teste () {
			return "TESTE";
		}
}
 