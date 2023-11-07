package com.spring.project.models;

import jakarta.persistence.*;

@Entity
@Table(name = "cadastros")
public class cadastrado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "nicknames",unique = true,length = 50)
    private String nome;
    @Column(name = "emails",unique = true,length = 50)
    private String email;
    @Column(name = "senha",length = 10)
    private String senha;

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getSenha() {
        return senha;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
