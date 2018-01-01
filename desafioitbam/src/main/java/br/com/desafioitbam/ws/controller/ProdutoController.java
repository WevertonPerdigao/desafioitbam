package br.com.desafioitbam.ws.controller;

import java.util.Collection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.desafioitbam.ws.model.Produto;
import br.com.desafioitbam.ws.service.ProdutoService;

@RestController
public class ProdutoController {

	@Autowired
	ProdutoService produtoService;
	
	
	@RequestMapping(method = RequestMethod.POST, value = "/produtos", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Produto> cadastrarProduto(@RequestBody Produto produto) {

		Produto produtoCadastrado = produtoService.cadastrar(produto);
		return new ResponseEntity<>(produtoCadastrado, HttpStatus.CREATED);
	}

	@RequestMapping(method = RequestMethod.GET, value = "/produtos", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Collection<Produto>> buscarTodosProdutos() {

		Collection<Produto> produtosBuscados = produtoService.buscarTodos();

		return new ResponseEntity<>(produtosBuscados, HttpStatus.OK);
	}
        @RequestMapping(method = RequestMethod.GET, value = "/produtos/{idproduto}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Produto> buscarClientePorId(@PathVariable Integer idproduto) {

		Produto produto = produtoService.buscarPorId(idproduto);

		return new ResponseEntity<>(produto, HttpStatus.OK);
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value = "/produtos/{idproduto}" )
	public ResponseEntity<Produto> excluirProduto(@PathVariable Integer idproduto) {
		
		Produto produtoEncontrado = produtoService.buscarPorId(idproduto);
		if (produtoEncontrado==null){
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		
		produtoService.excluir(produtoEncontrado);
		return new ResponseEntity<>( HttpStatus.OK);
	}
	
	@RequestMapping(method = RequestMethod.PUT, value = "/produtos", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Produto> alterarProduto(@RequestBody Produto produto) {

		Produto produtoAlterado = produtoService.alterar(produto);
		return new ResponseEntity<>(produtoAlterado, HttpStatus.OK);
	}


	

}