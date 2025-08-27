package com.example.JWTAuthentication.service;

import com.example.JWTAuthentication.models.Foo;
import com.example.JWTAuthentication.models.FooDetailDTO;

public class Mapper {
    
    public static FooDetailDTO toDetailDTO (Foo foo) {
        return new FooDetailDTO(foo);
    }

}