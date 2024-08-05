package com.br.Amigurumi.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "usuario")
public class Usuario {
	
private static final long serialVersionUID = 1L;	
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "usuario_id_usuario_seq")
	@SequenceGenerator(name = "usuario_id_usuario_seq", sequenceName = "usuario_id_usuario_seq", allocationSize = 1)
	@Column(name = "id_usuario", nullable = false)
	private Long idenUsuario;
	
	@Column(name = "login")
	private String login;
	
	@Column(name = "senha")
	private String senha;
	
	@Column(name = "status_usuario")
	private String status;

	@Column(name = "tp_usuario")
	private String tipo;

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

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Usuario() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Usuario(Long idenUsuario, String login, String senha, String status, String tipo) {
		super();
		this.idenUsuario = idenUsuario;
		this.login = login;
		this.senha = senha;
		this.status = status;
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "Usuario [idenUsuario=" + idenUsuario + ", login=" + login + ", senha=" + senha + ", status=" + status
				+ ", tipo=" + tipo + "]";
	}
		
}
