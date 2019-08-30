package br.com.assay.document;

import java.io.Serializable;

public class Usuario implements Serializable{
	private static final long serialVersionUID = -3915645540894985941L;
	
	private String nome;
	private Integer idade;
	
	public Usuario(String nome, Integer idade) {
		this.nome = nome;
		this.idade = idade;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Integer getIdade() {
		return idade;
	}
	public void setIdade(Integer idade) {
		this.idade = idade;
	}
	
	
	
	

}
