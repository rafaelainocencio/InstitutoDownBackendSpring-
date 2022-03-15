package com.recode.institutoDown.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.recode.institutoDown.entities.Candidatura;
import com.recode.institutoDown.entities.Empresa;
import com.recode.institutoDown.entities.Vaga;

public class EmpresaDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long id;
	private String nome;
	private String cnpj;
	private String cidade;
	private String estado;
	private String ramo;
	
	private List<Vaga> vagas = new ArrayList<>();
	
	public EmpresaDTO() {
	}

	public EmpresaDTO(Long id, String nome, String cnpj, String cidade, String estado, String ramo, List<Vaga> vagas) {
		this.id = id;
		this.nome = nome;
		this.cnpj = cnpj;
		this.cidade = cidade;
		this.estado = estado;
		this.ramo = ramo;
		this.vagas = vagas;
	}
	
	public EmpresaDTO(Empresa empresa) {
		id = empresa.getId();
		nome = empresa.getNome();
		cnpj = empresa.getCnpj();
		cidade = empresa.getCidade();
		estado = empresa.getEstado();
		ramo = empresa.getRamo();
		vagas = empresa.getVagas();
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

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
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

	public String getRamo() {
		return ramo;
	}

	public void setRamo(String ramo) {
		this.ramo = ramo;
	}

	public List<Vaga> getVagas() {
		return vagas;
	}

	public void setVagas(List<Vaga> vagas) {
		this.vagas = vagas;
	}

}
