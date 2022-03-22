package com.recode.institutoDown.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.recode.institutoDown.entities.Candidatura;
import com.recode.institutoDown.entities.Empresa;
import com.recode.institutoDown.entities.Vaga;

public class VagaDTO implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String nome;
	private String descricao;
	private Double salario;
	private String cargaHoraria;
	
	private Empresa empresa;
	
	private List<Candidatura> candidaturas = new ArrayList<>();
	
	public VagaDTO() {
	}

	public VagaDTO(Long id, String nome, String descricao, Double salario, String cargaHoraria,
			List<Candidatura> candidaturas) {
		super();
		this.id = id;
		this.nome = nome;
		this.descricao = descricao;
		this.salario = salario;
		this.cargaHoraria = cargaHoraria;
		this.candidaturas = candidaturas;
	}
	
	public VagaDTO(Vaga vaga) {
		super();
		id = vaga.getId();
		nome = vaga.getNome();
		descricao = vaga.getDescricao();
		salario = vaga.getSalario();
		cargaHoraria = vaga.getCargaHoraria();
		candidaturas = vaga.getCandidaturas();
		empresa = vaga.getEmpresa();
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

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	public String getCargaHoraria() {
		return cargaHoraria;
	}

	public void setCargaHoraria(String cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}

	public List<Candidatura> getCandidaturas() {
		return candidaturas;
	}

	public void setCandidaturas(List<Candidatura> candidaturas) {
		this.candidaturas = candidaturas;
	}

	public Empresa getEmpresa() {
		return empresa;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}
}
