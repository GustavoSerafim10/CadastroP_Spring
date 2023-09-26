package br.com.gustavo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.gustavo.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {

}
