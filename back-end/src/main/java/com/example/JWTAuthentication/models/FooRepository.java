package com.example.JWTAuthentication.models;

import java.util.Optional;

import org.springframework.data.repository.Repository;

public interface FooRepository extends Repository<Foo, Long> {

    public Optional<Foo> getFooById(Long id);

}