package com.br.Amigurumi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.br.Amigurumi.model.Produto;
import com.br.Amigurumi.repository.ProdutoRepository;


@Service
public class ProdutoService {

	@Autowired
	private ProdutoRepository produtoRepository;
	
	public Produto salvar (Produto produto) {
		return produtoRepository.save(produto);
	}
	
	public void deletar (Long id) {
		produtoRepository.deleteById(id);
	}
	
	public List<Produto> listarProdutos () {
		return produtoRepository.findAll();
	}
	
//	public Produto buscarPorCodigo (Long id) {
//		return produtoRepository.findById(id);
//	}
	
}
