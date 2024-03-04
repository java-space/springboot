package com.example.springboot.repos;

import com.example.springboot.entity.Employee;
import com.example.springboot.interfaceprojection.NamesOnly;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface EmployeeRepoScalarP extends JpaRepository<Employee, Integer> {

    List<Object> findByFirstName(String lastName);

    List<Employee> findFirst20ByAddresses_ProvinceContaining(String province);

    List<NamesOnly> findAllByFirstNameContaining(String name);

    @Query("""
            SELECT e.firstName, e.lastName
            FROM Employee e
            WHERE e.firstName LIKE :name
            """)
    List<Object[]> scalarProjection1(String name);

    @Query("""
            SELECT e.firstName
            FROM Employee e
            WHERE e.firstName LIKE :name
            """)
    List<Object[]> scalarProjection2(String name);
}
