package com.example.springboot.repos;

import com.example.springboot.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface EmployeeRepo extends JpaRepository<Employee, Integer> {

    List<Employee> findByLastName(String lastName);
    List<Employee> findByFirstName(String firstName);

    List<Employee> findFirst20ByAddresses_ProvinceContaining(String province);

    @Query("""
            SELECT e
            FROM Employee e
            WHERE e.firstName LIKE :name
            """)
    List<Employee> entity(String name);
}
