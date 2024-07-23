package com.br.Amigurumi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.br.Amigurumi.model.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long>{

}
