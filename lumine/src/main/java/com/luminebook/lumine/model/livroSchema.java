package com.luminebook.lumine.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

public class livroSchema {
    @Data
    @Document(collection = "livros")
    public class Livro {
        @Id
        private String id;
        private String titulo;
    }

    @Data
    @Document(collection = "autor")
    public class autor {
        private String nome;
        private String email;
        private String telefone;
    }
}
