package com.br.Amigurumi.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "PRODUTO")
public class Produto {

	private static final long serialVersionUID = 1L;

	@Id
//	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_PRODUTO")
//	@SequenceGenerator(name = "SEQ_PRODUTO", sequenceName = "PRODUTO", allocationSize = 1)
	@Column(name = "ID_PRODUTO")
	private Long idenProduto;
	
	@Column(name = "VL_PRODUTO")
	private Long vl_produto;
	
	@Column(name = "VL_MATERIAL")
	private Long vl_Material;
	
	@Column(name = "VL_MAO_DE_OBRA")
	private Long vl_maoDeObra;
	
	@Column(name = "DESCRICAO")
	private String descricao;
	
	@Column(name = "NOME_PRODUTO")
	private Long nomeProduto;

	public Long getIdenProduto() {
		return idenProduto;
	}

	public void setIdenProduto(Long idenProduto) {
		this.idenProduto = idenProduto;
	}

	public Long getVl_produto() {
		return vl_produto;
	}

	public void setVl_produto(Long vl_produto) {
		this.vl_produto = vl_produto;
	}

	public Long getVl_Material() {
		return vl_Material;
	}

	public void setVl_Material(Long vl_Material) {
		this.vl_Material = vl_Material;
	}

	public Long getVl_maoDeObra() {
		return vl_maoDeObra;
	}

	public void setVl_maoDeObra(Long vl_maoDeObra) {
		this.vl_maoDeObra = vl_maoDeObra;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Long getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(Long nomeProduto) {
		this.nomeProduto = nomeProduto;
	}
	
	public String toString() {
	return "Produto [idenProduto=" + idenProduto + ", nomeProduto=" + nomeProduto + ", descricao=" + descricao +
	", vl_produto=" + vl_produto + ", vl_maoDeObra" + vl_maoDeObra + ", vl_Material" + vl_Material + "]"; 
	}
		
}
