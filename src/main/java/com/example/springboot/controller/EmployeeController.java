package com.example.springboot.controller;

import com.example.springboot.entity.Employee;
import com.example.springboot.interfaceprojection.NameAddress;
import com.example.springboot.interfaceprojection.NamesOnly2;
import com.example.springboot.repos.*;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("employees")
@AllArgsConstructor
public class EmployeeController {

    private EmployeeRepoDynamic employeeRepo;


    @GetMapping
    public List<Employee> list() {
        return employeeRepo.findAll();
    }

    @GetMapping("names")
    @Transactional
    public List<NamesOnly2> findByName(@RequestParam("name") String name) {
        return employeeRepo.findByFirstName(name, NamesOnly2.class);
    }

    @GetMapping("name/search")
    public List<NameAddress> nameSearch(@RequestParam("name") String name) {
        return employeeRepo.findAllByFirstNameContaining(name, NameAddress.class);
    }

}
