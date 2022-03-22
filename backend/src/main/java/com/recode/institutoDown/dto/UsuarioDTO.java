package com.recode.institutoDown.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.recode.institutoDown.entities.Candidatura;
import com.recode.institutoDown.entities.Usuario;

public class UsuarioDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long id;
	private String nome;
	private String telefone;
	private String email;
	private String cidade;
	private String estado;

	private List<Candidatura> candidaturas = new ArrayList<>();

	public UsuarioDTO() {
	}

	public UsuarioDTO(Long id, String nome, String telefone, String email, String cidade, String estado,
			List<Candidatura> candidaturas) {
		this.id = id;
		this.nome = nome;
		this.telefone = telefone;
		this.email = email;
		this.cidade = cidade;
		this.estado = estado;
		this.candidaturas = candidaturas;
	}
	
	public UsuarioDTO(Usuario usuario) {
		id = usuario.getId();
		nome = usuario.getNome();
		telefone = usuario.getTelefone();
		email = usuario.getEmail();
		cidade = usuario.getCidade();
		estado = usuario.getEstado();
		candidaturas = usuario.getCandidaturas();
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

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public List<Candidatura> getCandidaturas() {
		return candidaturas;
	}
}
