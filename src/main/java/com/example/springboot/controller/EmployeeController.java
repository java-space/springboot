package com.example.springboot.controller;

import com.example.springboot.model.EmployeeDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;


public class EmployeeController implements EmployeeApi {

    @Override
    public ResponseEntity<EmployeeDTO> getEmployees() {
        return EmployeeApi.super.getEmployees();
    }
}
