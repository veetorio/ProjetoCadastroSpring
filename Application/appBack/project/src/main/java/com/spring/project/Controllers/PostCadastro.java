package com.spring.project.Controllers;
import com.spring.project.Interfaces.crudCadastros;
import com.spring.project.models.Cadastrado;

import org.springframework.beans.factory.annotation.Autowired;
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
    public List<Cadastrado> listaCadastrado(){
    return (List<Cadastrado>) dao.findAll();
}
@PostMapping("/enviar")
    public ResponseEntity<Cadastrado> userNew(@RequestBody Cadastrado novoCadastro){
    Cadastrado retornaCadastro = dao.save(novoCadastro);
    return ResponseEntity.status(201).body(retornaCadastro);
}



}
