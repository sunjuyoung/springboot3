package com.example.sprinboot3democlient.service;

import com.example.sprinboot3democlient.model.Student;
import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.HttpExchange;

import java.util.List;

@HttpExchange("/students")
public interface StudentClientService {

    @GetExchange
    List<Student> getAllStudents();
}
