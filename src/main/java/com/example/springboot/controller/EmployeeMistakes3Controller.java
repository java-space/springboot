package com.example.springboot.controller;

import com.example.springboot.dto.EmployeeContraintDTO;
import com.example.springboot.dto.EmployeeDTO;
import com.example.springboot.exception.InputValidationException;
import com.example.springboot.repos.EmployeeRepoDynamic;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("mistakes3")
@AllArgsConstructor
public class EmployeeMistakes3Controller {

    private EmployeeRepoDynamic employeeRepo;

    @RequestMapping("/post")
    public void addEmployee(@RequestBody EmployeeDTO employee) {
        boolean isEmployeeValid =
                (employee != null) && !employee.isWorking() && !(employee.getFullName().length() < 2);

        if (!isEmployeeValid) {
            throw new InputValidationException("Name invalid.");
        }

       // call service
    }

    @RequestMapping("/put")
    public void updateEmployee(@RequestBody @Valid EmployeeContraintDTO employee) {
        // call service
    }

}
