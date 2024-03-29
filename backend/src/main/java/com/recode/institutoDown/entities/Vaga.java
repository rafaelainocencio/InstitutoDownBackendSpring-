package com.recode.institutoDown.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Vaga implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	private String descricao;
	private Double salario;
	private String cargaHoraria;
	
	@JsonIgnore
	@OneToMany(mappedBy = "vaga")
	private List<Candidatura> candidaturas = new ArrayList<>();
	
	@ManyToOne
	@JsonIgnore
	@JoinColumn(name = "empresa_id")
	private Empresa empresa;

	
	public Vaga() {
	}

	public Vaga(Long id, String nome, String descricao, Double salario, String cargaHoraria, Empresa empresa, List<Candidatura> candidaturas) {
		super();
		this.id = id;
		this.nome = nome;
		this.descricao = descricao;
		this.salario = salario;
		this.cargaHoraria = cargaHoraria;
		this.empresa = empresa;
		this.candidaturas = candidaturas;
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

	public Empresa getEmpresa() {
		return empresa;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vaga other = (Vaga) obj;
		return Objects.equals(id, other.id);
	}

	public List<Candidatura> getCandidaturas() {
		return candidaturas;
	}
}
