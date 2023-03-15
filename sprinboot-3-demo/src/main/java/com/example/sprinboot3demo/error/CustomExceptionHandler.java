package com.example.sprinboot3demo.error;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ProblemDetail;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class CustomExceptionHandler {

    @ExceptionHandler(RuntimeException.class)
    public ProblemDetail onRuntimeException(RuntimeException ex){
        ProblemDetail detail
                = ProblemDetail.forStatusAndDetail(HttpStatus.BAD_REQUEST,ex.getMessage());
        /*
        *     "type": "about:blank",
                "title": "Bad Request",
                "status": 400,
                "detail": "student is not found",
                "instance": "/students/23"
                * */
        return detail;
    }
}
