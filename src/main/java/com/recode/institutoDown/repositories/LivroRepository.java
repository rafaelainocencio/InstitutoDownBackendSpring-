package com.recode.institutoDown.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.recode.institutoDown.entities.Livro;

public interface LivroRepository extends JpaRepository<Livro, Long> {

}
