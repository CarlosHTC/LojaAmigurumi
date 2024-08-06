package com.br.Amigurumi.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "endereco")
public class Endereco {

	private static final long serialVersionUID = 1L;	
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "endereco_id_endereco_seq")
	@SequenceGenerator(name = "endereco_id_endereco_seq", sequenceName = "endereco_id_endereco_seq", allocationSize = 1)
	@Column(name = "id_endereco", nullable = false)
	private Long idenEndereco;
	
	@Column(name = "numero")
	private String numero;
	
	@Column(name = "cep")
	private String cep;

	@Column(name = "uf")
	private String uf;

	@Column(name = "cidade")
	private String cidade;

	@Column(name = "pais")
	private String pais;
	
	@Column(name = "bairro")
	private String bairro;
	
	@Column(name = "rua")
	private String rua;
	
	@Column(name = "complemento")
	private String complemento;
	
	@Column(name = "id_cliente")
	private Long idenCliente;

	public Long getIdenEndereco() {
		return idenEndereco;
	}

	public void setIdenEndereco(Long idenEndereco) {
		this.idenEndereco = idenEndereco;
	}
	
	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public Long getIdenCliente() {
		return idenCliente;
	}

	public void setIdenCliente(Long idenCliente) {
		this.idenCliente = idenCliente;
	}

	public Endereco() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Endereco(Long idenEndereco, Long idenCliente, String numero, String cep, String uf, String cidade,
			String pais, String bairro, String rua, String complemento) {
		super();
		this.idenEndereco = idenEndereco;
		this.idenCliente = idenCliente;
		this.numero = numero;
		this.cep = cep;
		this.uf = uf;
		this.cidade = cidade;
		this.pais = pais;
		this.bairro = bairro;
		this.rua = rua;
		this.complemento = complemento;
	}

	@Override
	public String toString() {
		return "Endereco [idenEndereco=" + idenEndereco + ", idenUsuario=" + idenCliente + ", numero=" + numero
				+ ", cep=" + cep + ", uf=" + uf + ", cidade=" + cidade + ", pais=" + pais + ", bairro=" + bairro
				+ ", rua=" + rua + ", complemento=" + complemento + "]";
	}
	
	
}
