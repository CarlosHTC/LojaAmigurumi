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
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_PRODUTO")
	@SequenceGenerator(name = "SEQ_PRODUTO", sequenceName = "PRODUTO", allocationSize = 1)
	@Column(name = "ID_PRODUTO")
	private Long idenProduto;
}
