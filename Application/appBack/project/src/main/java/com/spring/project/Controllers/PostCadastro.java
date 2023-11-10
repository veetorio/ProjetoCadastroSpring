package com.spring.project.Controllers;
import com.spring.project.Service.ServiceCad;
import com.spring.project.models.Cadastrado;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@RestController
@CrossOrigin("*")
@RequestMapping("/database")
public class PostCadastro {

    @PostMapping("/enviar")
        public ResponseEntity<Cadastrado> criarUsuario(@RequestBody Cadastrado User){
        return ResponseEntity.status(HttpStatus.CREATED).body(services.serviceNovoUsuario(User));

    }
    @GetMapping("/listar")
    public ResponseEntity<List<Cadastrado>> listarCadastrados(){
        return ResponseEntity.status(HttpStatus.OK).body(services.serviceList());
    }

}
