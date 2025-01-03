package com.luminebook.lumine.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.luminebook.lumine.repository.repository;
import com.luminebook.lumine.model.livroSchema;

@Service
public class service {
    @Autowired
    private repository repository;

    public livroSchema saveLivro(livroSchema livro) {
        return repository.save(livro);
    }
}
