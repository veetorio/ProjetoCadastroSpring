package com.spring.project.models;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "Tabela-Cadastros")
public class Cadastrado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "nicknames",unique = true,length = 50)
    private String nome;
    @Column(name = "emails",unique = true,length = 50)
    private String email;
    @Column(name = "senha",length = 10)
    private String senha;
}
