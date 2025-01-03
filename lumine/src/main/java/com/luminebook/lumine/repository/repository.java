package com.luminebook.lumine.repository;

import com.luminebook.lumine.model.livroSchema;

import org.springframework.data.mongodb.repository.MongoRepository;
public interface repository extends MongoRepository<livroSchema, String> {
    
}
