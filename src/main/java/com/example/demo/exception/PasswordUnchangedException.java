package com.example.demo.exception;

public class PasswordUnchangedException extends RuntimeException{
    public PasswordUnchangedException(String message) {
        super(message);
    }
}
