package br.com.desafioitbam.ws.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.desafioitbam.ws.model.Produto;
import br.com.desafioitbam.ws.repository.ProdutoRepository;

@Service
public class ProdutoService {
	@Autowired
	ProdutoRepository produtoRepository; 


		public Produto cadastrar(Produto produto) {

		return produtoRepository.save(produto);

	}

	public Collection<Produto> buscarTodos() {
		return produtoRepository.findAll();
	}
	
	public void excluir (Produto produto){
		produtoRepository.delete(produto);
	}
	
	public Produto buscarPorId(Integer idproduto) {
		return produtoRepository.findOne(idproduto);
	}
	
	public Produto alterar(Produto produto){
		return produtoRepository.save(produto);
	}
}