package com.br.Amigurumi.model;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "pedido")
public class Pedido {
	
	private static final long serialVersionUID = 1L;	
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "pedido_id_pedido_seq")
	@SequenceGenerator(name = "pedido_id_pedido_seq", sequenceName = "pedido_id_pedido_seq", allocationSize = 1)
	@Column(name = "id_pedido", nullable = false)
	private Long idenPedido;
	
	@Column(name = "total_pedido")
	private Long tp;
	
	@Column(name = "dt_pedido")
	private LocalDate dataPedido;
	
	@Column(name = "status_pedido")
	private String stsPedido;

	@Column(name = "status_entrega")
	private String stsEntrega;
	
	@Column(name = "prazo_entrega")
	private LocalDate prazo;
	
	@Column(name = "id_cliente")
	private Long idenCliente;
	
	@Column(name = "id_endereco")
	private Long idenEndereco;
	
	@Column(name = "id_usuario")
	private Long idenUsuario;

	public Long getIdenPedido() {
		return idenPedido;
	}

	public void setIdenPedido(Long idenPedido) {
		this.idenPedido = idenPedido;
	}

	public Long getTp() {
		return tp;
	}

	public void setTp(Long tp) {
		this.tp = tp;
	}

	public LocalDate getDataPedido() {
		return dataPedido;
	}

	public void setDataPedido(LocalDate dataPedido) {
		this.dataPedido = dataPedido;
	}

	public String getStsPedido() {
		return stsPedido;
	}

	public void setStsPedido(String stsPedido) {
		this.stsPedido = stsPedido;
	}

	public String getStsEntrega() {
		return stsEntrega;
	}

	public void setStsEntrega(String stsEntrega) {
		this.stsEntrega = stsEntrega;
	}

	public LocalDate getPrazo() {
		return prazo;
	}

	public void setPrazo(LocalDate prazo) {
		this.prazo = prazo;
	}

	public Long getIdenCliente() {
		return idenCliente;
	}

	public void setIdenCliente(Long idenCliente) {
		this.idenCliente = idenCliente;
	}

	public Long getIdenEndereco() {
		return idenEndereco;
	}

	public void setIdenEndereco(Long idenEndereco) {
		this.idenEndereco = idenEndereco;
	}

	public Long getIdenUsuario() {
		return idenUsuario;
	}

	public void setIdenUsuario(Long idenUsuario) {
		this.idenUsuario = idenUsuario;
	}

	public Pedido() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Pedido(Long idenPedido, Long tp, LocalDate dataPedido, String stsPedido, String stsEntrega, LocalDate prazo,
			Long idenCliente, Long idenEndereco, Long idenUsuario) {
		super();
		this.idenPedido = idenPedido;
		this.tp = tp;
		this.dataPedido = dataPedido;
		this.stsPedido = stsPedido;
		this.stsEntrega = stsEntrega;
		this.prazo = prazo;
		this.idenCliente = idenCliente;
		this.idenEndereco = idenEndereco;
		this.idenUsuario = idenUsuario;
	}

	@Override
	public String toString() {
		return "Pedido [idenPedido=" + idenPedido + ", tp=" + tp + ", dataPedido=" + dataPedido + ", stsPedido="
				+ stsPedido + ", stsEntrega=" + stsEntrega + ", prazo=" + prazo + ", idenCliente=" + idenCliente
				+ ", idenEndereco=" + idenEndereco + ", idenUsuario=" + idenUsuario + "]";
	}
	
}
