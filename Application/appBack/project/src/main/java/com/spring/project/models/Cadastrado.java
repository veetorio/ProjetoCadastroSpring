package com.spring.project.models;

import jakarta.persistence.*;


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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
