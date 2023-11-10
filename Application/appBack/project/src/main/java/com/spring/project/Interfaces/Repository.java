package com.spring.project.Interfaces;

import com.spring.project.models.Cadastrado;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Repository extends JpaRepository<Cadastrado,Integer> {
}
