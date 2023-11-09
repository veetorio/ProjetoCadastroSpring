package com.spring.project.Controllers;
import com.spring.project.Interfaces.crudCadastros;
import com.spring.project.models.Cadastrado;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@CrossOrigin("*")
@RequestMapping("/database")
public class PostCadastro {
    @Autowired
    private crudCadastros dao;
    private PasswordEncoder codificador = new BCryptPasswordEncoder();



@GetMapping("/Cadastrados")
    public   ResponseEntity<List<Cadastrado>>  listaCadastrado(){
        List<Cadastrado> ListaDeCadastrados = (List<Cadastrado>) dao.findAll();
        return ResponseEntity.status(HttpStatus.ACCEPTED).body(ListaDeCadastrados);
}
@PostMapping("/enviar")
    public ResponseEntity<Cadastrado> userNew(@RequestBody Cadastrado novoCadastro){
    String senhaCodificada =  codificador.encode(novoCadastro.getSenha());
    novoCadastro.setSenha(senhaCodificada);
    Cadastrado newuser = dao.save(novoCadastro);
    return ResponseEntity.status(HttpStatus.CREATED).body(newuser);
}



}
