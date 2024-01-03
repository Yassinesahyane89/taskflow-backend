package com.example.demo.exception;

public class PasswordConfirmationException extends RuntimeException{
    public PasswordConfirmationException(String message) {
        super(message);
    }
}
