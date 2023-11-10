package com.spring.project.Service;

import com.spring.project.Interfaces.Repository;
import com.spring.project.models.Cadastrado;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceCad {

    private Repository dao;

    public ServiceCad(Repository _dao){
        this.dao = _dao;
    }
    private PasswordEncoder codificador = new BCryptPasswordEncoder();

    public List<Cadastrado> serviceList(){
        List<Cadastrado> ListaDeCadastrados = dao.findAll();
        return ListaDeCadastrados;
    }

    public Cadastrado serviceNovoUsuario(Cadastrado novoCadastro){
        String senhaCodificada =  codificador.encode(novoCadastro.getSenha());
        novoCadastro.setSenha(senhaCodificada);
        Cadastrado newuser = dao.save(novoCadastro);
        return newuser;
    }

}
