package com.spring.project.Interfaces;

import com.spring.project.models.Cadastrado;
import org.springframework.data.repository.CrudRepository;

public interface crudCadastros extends CrudRepository<Cadastrado,Integer> {
}
