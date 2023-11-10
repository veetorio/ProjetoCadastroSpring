package com.spring.project.Service;

import com.spring.project.Interfaces.crudCadastros;
import com.spring.project.models.Cadastrado;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import java.util.List;

@Service
public class ServiceCad {

    @Autowired
    private crudCadastros dao;
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
