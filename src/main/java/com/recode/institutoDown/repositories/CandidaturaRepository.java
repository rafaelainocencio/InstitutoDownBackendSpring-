package com.recode.institutoDown.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.recode.institutoDown.entities.Candidatura;

public interface CandidaturaRepository extends JpaRepository<Candidatura, Long> {
	
}
