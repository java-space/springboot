package com.example.springboot.service;

import com.example.springboot.entity.Employee;
import com.example.springboot.repos.EmployeeRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@AllArgsConstructor
@Transactional
public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeRepo employeeRepo;

    @Override
    public List<Employee> getList() {
        return employeeRepo.findAll();
    }
}
