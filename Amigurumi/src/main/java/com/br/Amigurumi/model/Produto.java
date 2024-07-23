package com.br.Amigurumi.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "produto")
public class Produto {
	
private static final long serialVersionUID = 1L;	
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "produto_id_produto_seq")
	@SequenceGenerator(name = "produto_id_produto_seq", sequenceName = "produto_id_produto_seq", allocationSize = 1)
	@Column(name = "id_produto", nullable = false)
	private Long idenProduto;
	
	@Column(name = "descricao")
	private String descricao;
	
	@Column(name = "vl_produto")
	private String valorProduto;
	
	@Column(name = "nome_produto")
	private String nomeProduto;

	@Column(name = "vl_maoDeObra")
	private String valorMaoDeObra;
	
	@Column(name = "vl_material")
	private String valorMaterial;

	public Long getIdenProduto() {
		return idenProduto;
	}

	public void setIdenProduto(Long idenProduto) {
		this.idenProduto = idenProduto;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getValorProduto() {
		return valorProduto;
	}

	public void setValorProduto(String valorProduto) {
		this.valorProduto = valorProduto;
	}

	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

	public String getValorMaoDeObra() {
		return valorMaoDeObra;
	}

	public void setValorMaoDeObra(String valorMaoDeObra) {
		this.valorMaoDeObra = valorMaoDeObra;
	}

	public String getValorMaterial() {
		return valorMaterial;
	}

	public void setValorMaterial(String valorMaterial) {
		this.valorMaterial = valorMaterial;
	}

	public Produto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Produto(Long idenProduto, String descricao, String valorProduto, String nomeProduto, String valorMaoDeObra,
			String valorMaterial) {
		super();
		this.idenProduto = idenProduto;
		this.descricao = descricao;
		this.valorProduto = valorProduto;
		this.nomeProduto = nomeProduto;
		this.valorMaoDeObra = valorMaoDeObra;
		this.valorMaterial = valorMaterial;
	}

	@Override
	public String toString() {
		return "Produto [idenProduto=" + idenProduto + ", descricao=" + descricao + ", valorProduto=" + valorProduto
				+ ", nomeProduto=" + nomeProduto + ", valorMaoDeObra=" + valorMaoDeObra + ", valorMaterial="
				+ valorMaterial + "]";
	}
	
}
