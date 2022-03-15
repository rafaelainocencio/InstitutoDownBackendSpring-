package com.recode.institutoDown.dto;

import java.io.Serializable;
import java.time.Instant;

import com.recode.institutoDown.entities.Candidatura;
import com.recode.institutoDown.entities.Empresa;
import com.recode.institutoDown.entities.Usuario;
import com.recode.institutoDown.entities.Vaga;

public class CandidaturaDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long id;
	
	private Usuario usuario;
	
	private Vaga vaga;
	 
	public CandidaturaDTO() {
	}

	public CandidaturaDTO( Usuario usuario, Vaga vaga, Instant data, Long id) {
		this.id = id;
		this.usuario = usuario;
		this.vaga = vaga;
	}

	public CandidaturaDTO(Candidatura candidatura) {
		id = candidatura.getId();
		usuario = candidatura.getUsuario();
		vaga = candidatura.getVaga();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Vaga getVaga() {
		return vaga;
	}

	public void setVaga(Vaga vaga) {
		this.vaga = vaga;
	}
}
