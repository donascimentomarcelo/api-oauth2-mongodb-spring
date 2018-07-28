package br.com.receita.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Usuario implements Serializable{


	private static final long serialVersionUID = 1L;
	
	@Id
	private String id;
	private String nome;
	private int idade;
	private String email;
	@DBRef
	private List<Perfil> perfis =  new ArrayList<>();
	private String senha;
	
	public Usuario() {
		
	}
	
	public Usuario(Usuario usuario) {
		this.nome = usuario.getNome();
		this.email = usuario.getEmail();
		this.senha = usuario.getSenha();
		this.perfis = usuario.getPerfis();
	}
	
	public Usuario(String id, String nome, int idade, String email, String senha) {
		super();
		this.id = id;
		this.nome = nome;
		this.idade = idade;
		this.email = email;
		this.senha = senha;
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

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<Perfil> getPerfis() {
		return perfis;
	}

	public void setPerfis(List<Perfil> perfis) {
		this.perfis = perfis;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	
	
	
}
