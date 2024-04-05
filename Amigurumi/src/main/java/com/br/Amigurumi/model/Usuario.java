package com.br.Amigurumi.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "USUARIO")
public class Usuario {

	private static final long serialVersionUID = 1L;

	@Id
//	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_USUARIO")
//	@SequenceGenerator(name = "SEQ_USUARIO", sequenceName = "USUARIO", allocationSize = 1)
	@Column(name = "ID_USUARIO")
	private Long idenUsuario;
	
	@Column(name = "LOGIN")
	private String login;
	
	@Column(name = "SENHA")
	private String senha;
	
	@Column(name = "STATUS_USUARIO")
	private int status;

	@Column(name = "TP_USUARIO")
	private int tipo;

	public Long getIdenUsuario() {
		return idenUsuario;
	}

	public void setIdenUsuario(Long idenUsuario) {
		this.idenUsuario = idenUsuario;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
	
	public String toString() {
		return "Usuario [idenUsuario=" + idenUsuario + ", login=" + login + ", senha=" + senha +
		", status=" + status + ", tipo" + tipo + "]"; 
	}
	
}
