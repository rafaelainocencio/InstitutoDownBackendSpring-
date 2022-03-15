package com.recode.institutoDown.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.recode.institutoDown.entities.Empresa;

public interface EmpresaRepository extends JpaRepository<Empresa, Long> {

}
