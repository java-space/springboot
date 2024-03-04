package com.example.springboot.repos;

import com.example.springboot.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface EmployeeRepoDynamic extends JpaRepository<Employee, Integer> {

    <T> List<T>  findByFirstName(String lastName, Class<T> type);

    <T> List<T> findAllByFirstNameContaining(String name, Class<T> type);

    @Query("""
            SELECT new com.example.springboot.recordprojection.NamesOnlyRecord(e.firstName,e.lastName)
            FROM Employee e
            WHERE e.firstName LIKE :name
            """)
    <T> List<T> record(String name, Class<T> type);
}
