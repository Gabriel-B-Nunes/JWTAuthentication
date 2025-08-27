package com.example.JWTAuthentication.controller;

import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.JWTAuthentication.models.Foo;
import com.example.JWTAuthentication.models.FooDetailDTO;
import com.example.JWTAuthentication.models.FooRepository;

@RestController("/foo")
public class FooController {

    private FooRepository fooRepository;

    public FooController(FooRepository fooRepository) {
        this.fooRepository = fooRepository;
    }

    @GetMapping("/{id}")
    public ResponseEntity<FooDetailDTO> getFooById(@PathVariable Long id) {
        Optional<Foo> fooOptional = fooRepository.getFooById(id);
        if (fooOptional.isEmpty()) {
            throw new RuntimeException();
        }

        return new ResponseEntity(fooOptional.get(), HttpStatus.OK);
    }


}