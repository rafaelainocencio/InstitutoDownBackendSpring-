package com.recode.institutoDown.dto;

import java.io.Serializable;

import com.recode.institutoDown.entities.Livro;

public class LivroDTO implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String nome;
	private String descricao;
	private String imagem;
	
	public LivroDTO() {
	}

	public LivroDTO(Long id, String nome, String descricao, String imagem) {
		this.id = id;
		this.nome = nome;
		this.descricao = descricao;
		this.imagem = imagem;
	}
	
	public LivroDTO(Livro livro) {
		id = livro.getId();
		nome = livro.getNome();
		descricao = livro.getDescricao();
		imagem = livro.getImagem();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getImagem() {
		return imagem;
	}

	public void setImagem(String imagem) {
		this.imagem = imagem;
	}
}
