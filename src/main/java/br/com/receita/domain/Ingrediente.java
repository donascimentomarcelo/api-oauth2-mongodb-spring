package br.com.receita.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Ingrediente {
	
	@Id
	private String id;
	private String nome;
	private Double quantidade;
	private String marca;
	
	public Ingrediente() {
		super();
	}
	
	public Ingrediente(String id, String nome, Double quantidade, String marca) {
		super();
		this.id = id;
		this.nome = nome;
		this.quantidade = quantidade;
		this.marca = marca;
	}

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Double getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(Double quantidade) {
		this.quantidade = quantidade;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	
}
