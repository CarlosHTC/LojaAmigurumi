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

import com.br.Amigurumi.model.Produto;
import com.br.Amigurumi.service.produtoService;

@RestController
@RequestMapping("/produto")
public class ProdutoResource {
	
	@Autowired
	private produtoService produtoService;
	
	@PostMapping("/salvar")
	public Produto salvar (@RequestBody Produto produto) {
		return produtoService.salvar(produto);
	}
	
	@GetMapping("/listar")
	public List<Produto> listarProdutos() {
		return produtoService.listarProdutos();
	}
	
	@DeleteMapping("/{id}")
	public void deletarProduo(@PathVariable Long id) {
		produtoService.deletar(id);
	}
	
}
