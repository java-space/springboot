package com.example.springboot.repos;

import com.example.springboot.entity.Employee;
import com.example.springboot.interfaceprojection.NameAddress;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface EmployeeRepoNestedP extends JpaRepository<Employee, Integer> {

    List<NameAddress> findByFirstName(String lastName);

    List<NameAddress> findFirst20ByAddresses_ProvinceContaining(String province);

    List<NameAddress> findAllByFirstNameContaining(String name);

    @Query("""
            SELECT e
            FROM Employee e
            WHERE e.firstName LIKE :name
            """)
    List<NameAddress> nestedProjection(String name);
}
