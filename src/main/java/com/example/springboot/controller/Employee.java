package com.example.springboot.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Employee implements EmployeeApi {

    @Override
    public ResponseEntity<com.example.springboot.model.Employee> getEmployees() {
        return EmployeeApi.super.getEmployees();
    }
}
