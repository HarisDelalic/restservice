package com.dela.exceptions;

public class PostNotFoundException extends RuntimeException {

    public PostNotFoundException(Integer id) {
        super("Post with ID: " + id + " not found");
    }
}
