package br.com.desafioitbam.ws.model;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Produto {
	@Id
	@GeneratedValue
	private Integer idproduto;
	private String nome;
	private BigDecimal preco;

	public Integer getIdproduto() {
		return idproduto;
	}

	public void setIdproduto(Integer idproduto) {
		this.idproduto = idproduto;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public BigDecimal getPreco() {
		return preco;
	}

	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}

}
