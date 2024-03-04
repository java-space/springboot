package com.example.springboot.repos;

import com.example.springboot.entity.Employee;
import com.example.springboot.interfaceprojection.NamesOnly;
import com.example.springboot.interfaceprojection.NamesOnly2;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface EmployeeRepoIP extends JpaRepository<Employee, Integer> {

    //List<NamesOnly> findByFirstName(String lastName);

    List<NamesOnly> findAllByFirstNameContaining(String name);

    @Query("""
            SELECT e.firstName, e.lastName
            FROM Employee e
            WHERE e.firstName LIKE :name
            """)
    List<NamesOnly> interfaceDemo2(String name);

    List<NamesOnly2> findByFirstName(String lastName);
}
