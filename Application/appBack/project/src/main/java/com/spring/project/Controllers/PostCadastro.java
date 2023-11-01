package com.spring.project.Controllers;
import com.spring.project.Interfaces.crudCadastros;
import com.spring.project.models.Cadastrado;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/BankAPI")
public class PostCadastro {
@Autowired
    private crudCadastros dao;

@GetMapping("/Cadastrados")
    public List<Cadastrado> listaCadastrado(){
    return (List<Cadastrado>) dao.findAll();
}
@PostMapping("/enviar")
    public Cadastrado userNew(@RequestBody Cadastrado novoCadastro){
    Cadastrado retornaCadastro = dao.save(novoCadastro);
    return retornaCadastro;
}



}
