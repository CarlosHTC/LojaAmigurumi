package com.br.Amigurumi.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "cliente")
public class Cliente implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
//	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_Cliente")
//	@SequenceGenerator(name = "SEQ_Cliente", sequenceName = "cliente", allocationSize = 1)
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
	
	@Override
	public String toString() {
		return "Cliente [idenCliente=" + idenCliente + ", nomeCliente=" + nomeCliente + ", cpf=" + cpf +
				", email=" + email + ", telefone" + telefone + "]"; 
	}
	
	
}
