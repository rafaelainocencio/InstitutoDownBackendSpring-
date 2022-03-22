package com.recode.institutoDown.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.recode.institutoDown.dto.CandidaturaDTO;
import com.recode.institutoDown.entities.Candidatura;
import com.recode.institutoDown.repositories.CandidaturaRepository;



@Service
public class CandidaturaService {
	
	@Autowired
	private CandidaturaRepository repository;

	@Transactional(readOnly = true)
	public Page<CandidaturaDTO> findAll(Pageable pageable) {
		Page<Candidatura> result = repository.findAll(pageable);
		Page<CandidaturaDTO> page = result.map(x -> new CandidaturaDTO(x));
		return page;
	}

	@Transactional(readOnly = true)
	public CandidaturaDTO findById(Long id) {
		Candidatura result = repository.findById(id).get();
		CandidaturaDTO dto = new CandidaturaDTO(result);
		return dto;
	}

	@Transactional
	public Candidatura update(Long id, Candidatura obj){
		Candidatura novoCandidatura = repository.getOne(id);
		updateData(novoCandidatura, obj);
		return repository.save(novoCandidatura);
	}

	private void updateData(Candidatura result, Candidatura obj) {
		result.setUsuario(obj.getUsuario());
		result.setVaga(obj.getVaga());
	}
	
	public Candidatura fromDTO(CandidaturaDTO objDto){
		return new Candidatura( objDto.getId(), objDto.getUsuario(), objDto.getVaga());
	}

	@Transactional
	public Candidatura insert(Candidatura obj){
		return repository.save(obj);
	}

	@Transactional
	public void delete(Long id){
		repository.deleteById(id);
	}
}
