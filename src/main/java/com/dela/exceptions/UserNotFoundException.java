package com.dela.exceptions;

public class UserNotFoundException extends RuntimeException {

    public UserNotFoundException(Integer id) {
        super("User with ID: " + id + " not found");
    }
}
