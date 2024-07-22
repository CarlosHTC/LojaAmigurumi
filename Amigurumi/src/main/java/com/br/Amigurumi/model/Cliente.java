package com.br.Amigurumi.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "cliente")
public class Cliente {
	
	private static final long serialVersionUID = 1L;	
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "cliente_id_cliente_seq")
	@SequenceGenerator(name = "cliente_id_cliente_seq", sequenceName = "cliente_id_cliente_seq", allocationSize = 1)
	@Column(name = "id_cliente", nullable = false)
	private Long idenCliente;
	
	@Column(name = "telefone")
	private String telefone;
	
	@Column(name = "cpf", nullable = false)
	private String cpf;
	
	@Column(name = "nome_cliente", nullable = false)
	private String nomeCliente;

	@Column(name = "email")
	private String email;
	
	@Column(name = "senha")
	private String senha;
	
	public Cliente(Long idenCliente, String telefone, String cpf, String nomeCliente, String email, String senha) {
		super();
		this.idenCliente = idenCliente;
		this.telefone = telefone;
		this.cpf = cpf;
		this.nomeCliente = nomeCliente;
		this.email = email;
		this.senha = senha;
	}

	public Long getIdenCliente() {
		return idenCliente;
	}

	public void setIdenCliente(Long idenCliente) {
		this.idenCliente = idenCliente;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	@Override
	public String toString() {
		return "Cliente [idenCliente=" + idenCliente + ", telefone=" + telefone + ", cpf=" + cpf + ", nomeCliente="
				+ nomeCliente + ", email=" + email + ", senha=" + senha + "]";
	}
	
}
