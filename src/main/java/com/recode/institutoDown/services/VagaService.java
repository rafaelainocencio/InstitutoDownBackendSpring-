package com.recode.institutoDown.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.recode.institutoDown.dto.VagaDTO;
import com.recode.institutoDown.entities.Vaga;
import com.recode.institutoDown.repositories.VagaRepository;



@Service
public class VagaService {
	
	@Autowired
	private VagaRepository repository;

	@Transactional(readOnly = true)
	public Page<VagaDTO> findAll(Pageable pageable) {
		Page<Vaga> result = repository.findAll(pageable);
		Page<VagaDTO> page = result.map(x -> new VagaDTO(x));
		return page;
	}

	@Transactional(readOnly = true)
	public VagaDTO findById(Long id) {
		Vaga result = repository.findById(id).get();
		VagaDTO dto = new VagaDTO(result);
		return dto;
	}

	@Transactional
	public Vaga update(Long id, Vaga obj){
		Vaga novoVaga = repository.getOne(id);
		updateData(novoVaga, obj);
		return repository.save(novoVaga);
	}

	private void updateData(Vaga result, Vaga obj) {
		result.setNome(obj.getNome());
		result.setDescricao(obj.getDescricao());
		result.setCargaHoraria(obj.getCargaHoraria());
		result.setSalario(obj.getSalario());
		result.setEmpresa(obj.getEmpresa()); // TIRAR ISSO, TALVEZ
	}
	public Vaga fromDTO(VagaDTO objDto){
		return new Vaga(objDto.getId(), objDto.getNome(), objDto.getDescricao(), objDto.getSalario(), objDto.getCargaHoraria(), objDto.getEmpresa());
	}

	@Transactional
	public Vaga insert(Vaga obj){
		return repository.save(obj);
	}

	@Transactional
	public void delete(Long id){
		repository.deleteById(id);
	}
}
