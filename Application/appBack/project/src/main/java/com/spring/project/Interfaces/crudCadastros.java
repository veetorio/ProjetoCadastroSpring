package com.spring.project.Interfaces;

import com.spring.project.models.Cadastrado;
import org.springframework.data.jpa.repository.JpaRepository;

public interface crudCadastros extends JpaRepository<Cadastrado,Integer> {
}
