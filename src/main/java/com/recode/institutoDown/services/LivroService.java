package com.recode.institutoDown.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.recode.institutoDown.dto.LivroDTO;
import com.recode.institutoDown.entities.Livro;
import com.recode.institutoDown.repositories.LivroRepository;



@Service
public class LivroService {
	
	@Autowired
	private LivroRepository repository;

	@Transactional(readOnly = true)
	public Page<LivroDTO> findAll(Pageable pageable) {
		Page<Livro> result = repository.findAll(pageable);
		Page<LivroDTO> page = result.map(x -> new LivroDTO(x));
		return page;
	}

	@Transactional(readOnly = true)
	public LivroDTO findById(Long id) {
		Livro result = repository.findById(id).get();
		LivroDTO dto = new LivroDTO(result);
		return dto;
	}

	@Transactional
	public Livro update(Long id, Livro obj){
		Livro novoLivro = repository.getOne(id);
		updateData(novoLivro, obj);
		return repository.save(novoLivro);
	}

	private void updateData(Livro result, Livro obj) {
		result.setNome(obj.getNome());
		result.setDescricao(obj.getDescricao());
		result.setImagem(obj.getImagem());
	}
	public Livro fromDTO(LivroDTO objDto){
		return new Livro(objDto.getId(), objDto.getNome(), objDto.getDescricao(), objDto.getImagem());
	}

	@Transactional
	public Livro insert(Livro obj){
		return repository.save(obj);
	}

	@Transactional
	public void delete(Long id){
		repository.deleteById(id);
	}
	
}
