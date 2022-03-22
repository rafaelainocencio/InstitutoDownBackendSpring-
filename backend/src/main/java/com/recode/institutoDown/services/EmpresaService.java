package com.recode.institutoDown.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.recode.institutoDown.dto.EmpresaDTO;
import com.recode.institutoDown.entities.Empresa;
import com.recode.institutoDown.repositories.EmpresaRepository;



@Service
public class EmpresaService {
	
	@Autowired
	private EmpresaRepository repository;

	@Transactional(readOnly = true)
	public Page<EmpresaDTO> findAll(Pageable pageable) {
		Page<Empresa> result = repository.findAll(pageable);
		Page<EmpresaDTO> page = result.map(x -> new EmpresaDTO(x));
		return page;
	}

	@Transactional(readOnly = true)
	public EmpresaDTO findById(Long id) {
		Empresa result = repository.findById(id).get();
		EmpresaDTO dto = new EmpresaDTO(result);
		return dto;
	}

	@Transactional
	public Empresa update(Long id, Empresa obj){
		Empresa novoEmpresa = repository.getOne(id);
		updateData(novoEmpresa, obj);
		return repository.save(novoEmpresa);
	}

	private void updateData(Empresa result, Empresa obj) {
		result.setNome(obj.getNome());
		result.setCnpj(obj.getCnpj());
		result.setCidade(obj.getCidade());
		result.setEstado(obj.getEstado());
		result.setRamo(obj.getRamo());
	}
	
	public Empresa fromDTO(EmpresaDTO objDto){
		return new Empresa(objDto.getId(), objDto.getNome(), objDto.getCnpj(), objDto.getCidade(), objDto.getEstado(), objDto.getRamo());
	}

	@Transactional
	public Empresa insert(Empresa obj){
		return repository.save(obj);
	}

	@Transactional
	public void delete(Long id){
		repository.deleteById(id);
	}
	
}
