package br.com.desafioitbam.ws.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.desafioitbam.ws.model.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto,Integer> {

}
