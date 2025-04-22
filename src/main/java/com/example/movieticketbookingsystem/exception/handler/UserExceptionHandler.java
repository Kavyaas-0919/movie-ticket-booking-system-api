package com.example.movieticketbookingsystem.exception.handler;

import com.example.movieticketbookingsystem.exception.UserExistByEmailException;
import com.example.movieticketbookingsystem.utility.ErrorStructure;
import com.example.movieticketbookingsystem.utility.RestResponseBuilder;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
@AllArgsConstructor
public class UserExceptionHandler {
    private final RestResponseBuilder responseBuilder;
    @ExceptionHandler
    public ResponseEntity<ErrorStructure> handleUseExistByEmailException(UserExistByEmailException ex){
        return  responseBuilder.errror(HttpStatus.OK, ex.getMessage());
    }

}