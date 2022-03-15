package com.recode.institutoDown.controllers;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.recode.institutoDown.dto.LivroDTO;
import com.recode.institutoDown.entities.Livro;
import com.recode.institutoDown.services.LivroService;



@RestController
@RequestMapping(value = "/livros")
public class LivroController {
		
		@Autowired
		private LivroService service;

		@GetMapping
		public Page<LivroDTO> findAll(Pageable pageable){
			return service.findAll(pageable);
		}

		@GetMapping(value = "/{id}")
		public LivroDTO findById(@PathVariable Long id){
			return service.findById(id);
		}

		@PutMapping(value = "/{id}")
		public ResponseEntity<Void> update(@RequestBody LivroDTO objDto, @PathVariable Long id){
			Livro obj = service.fromDTO(objDto);
			obj.setId(id);
			obj = service.update(id, obj);
			return ResponseEntity.noContent().build();
		}

		@PostMapping
		public ResponseEntity<Livro> insert(@RequestBody Livro obj){
			obj = service.insert(obj);
			URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(obj.getId()).toUri();
			return ResponseEntity.created(uri).body(obj);
		}

		@DeleteMapping(value = "/{id}")
		public ResponseEntity<Void> delete(@PathVariable Long id){
			service.delete(id);
			return ResponseEntity.noContent().build();
		}
}	
