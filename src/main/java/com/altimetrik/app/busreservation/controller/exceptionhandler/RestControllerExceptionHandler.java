package com.altimetrik.app.busreservation.controller.exceptionhandler;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.altimetrik.app.busreservation.controller.dto.ErrorDTO;

@RestControllerAdvice
public class RestControllerExceptionHandler extends ResponseEntityExceptionHandler {

    @Override
    protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex, HttpHeaders headers, HttpStatus status, WebRequest request) {
            ErrorDTO error = new ErrorDTO(HttpStatus.BAD_REQUEST, "Validation Error", ex.getBindingResult().toString());
            return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
    }
   
}