package com.luminebook.lumine.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.luminebook.lumine.service.service;
import com.luminebook.lumine.model.livroSchema;

@RestController
public class controller {
    @Autowired
    private service service;

    @GetMapping("/")
    public String getHello() {
        return "Livraria Lumine";
    }

    @PostMapping("/livro")
    public livroSchema criarLivro(@RequestBody livroSchema livro) {
        return service.saveLivro(livro);
    }

}
