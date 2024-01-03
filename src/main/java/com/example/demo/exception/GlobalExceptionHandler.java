package com.example.demo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class GlobalExceptionHandler {

    // Add an exception handler for UserNotFoundException
    @ExceptionHandler(UserNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public String handleUserNotFoundException(UserNotFoundException ex) {
        return ex.getMessage();
    }

    // Add an exception handler for PasswordConfirmationException
    @ExceptionHandler(PasswordConfirmationException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public String handlePasswordConfirmationException(PasswordConfirmationException ex) {
        return ex.getMessage();
    }

    // Add an exception handler for PasswordUnchangedException
    @ExceptionHandler(PasswordUnchangedException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public String handlePasswordUnchangedException(PasswordUnchangedException ex) {
        return ex.getMessage();
    }
}
