package com.recode.institutoDown.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.recode.institutoDown.dto.UsuarioDTO;
import com.recode.institutoDown.entities.Usuario;
import com.recode.institutoDown.repositories.UsuarioRepository;



@Service
public class UsuarioService {
	
	@Autowired
	private UsuarioRepository repository;

	@Transactional(readOnly = true)
	public Page<UsuarioDTO> findAll(Pageable pageable) {
		Page<Usuario> result = repository.findAll(pageable);
		Page<UsuarioDTO> page = result.map(x -> new UsuarioDTO(x));
		return page;
	}

	@Transactional(readOnly = true)
	public UsuarioDTO findById(Long id) {
		Usuario result = repository.findById(id).get();
		UsuarioDTO dto = new UsuarioDTO(result);
		return dto;
	}

	@Transactional
	public Usuario update(Long id, Usuario obj){
		Usuario novoUsuario = repository.getOne(id);
		updateData(novoUsuario, obj);
		return repository.save(novoUsuario);
	}

	private void updateData(Usuario result, Usuario obj) {
		result.setNome(obj.getNome());
		result.setTelefone(obj.getTelefone());
		result.setEmail(obj.getEmail());
		result.setCidade(obj.getCidade());
		result.setEstado(obj.getEstado());
	}
	public Usuario fromDTO(UsuarioDTO objDto){
		return new Usuario(objDto.getId(), objDto.getNome(), objDto.getTelefone(), objDto.getEmail(), objDto.getCidade(), objDto.getEstado());
	}

	@Transactional
	public Usuario insert(Usuario obj){
		return repository.save(obj);
	}

	@Transactional
	public void delete(Long id){
		repository.deleteById(id);
	}
	
}
