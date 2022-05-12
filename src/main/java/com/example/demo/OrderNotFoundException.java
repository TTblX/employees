package com.example.demo;

public class OrderNotFoundException extends RuntimeException{

    public OrderNotFoundException(Long id){
        super("Couldn't find order " + id);
    }
}
