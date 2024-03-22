package com.example.springboot.service;

import com.example.springboot.entity.Employee;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


public interface EmployeeService {
   List<Employee> getList();
}
