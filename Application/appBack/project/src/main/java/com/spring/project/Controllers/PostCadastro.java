package com.spring.project.Controllers;
import com.spring.project.Interfaces.crudCadastros;
import com.spring.project.models.Cadastrado;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@CrossOrigin("*")
@RequestMapping("/database")
public class PostCadastro {
@Autowired
    private crudCadastros dao;

@GetMapping("/Cadastrados")
    public   ResponseEntity<List<Cadastrado>>  listaCadastrado(){

        List<Cadastrado> ListaDeCadastrados = (List<Cadastrado>) dao.findAll();
        return ResponseEntity.status(200).body(ListaDeCadastrados);
}
@PostMapping("/enviar")
    public ResponseEntity<Cadastrado> userNew(@RequestBody Cadastrado novoCadastro){
    Cadastrado newuser = dao.save(novoCadastro);
    return ResponseEntity.status(201).body(newuser);
}



}
