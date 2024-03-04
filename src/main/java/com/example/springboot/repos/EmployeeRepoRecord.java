package com.example.springboot.repos;

import com.example.springboot.entity.Employee;
import com.example.springboot.recordprojection.NamesOnlyRecord;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface EmployeeRepoRecord extends JpaRepository<Employee, Integer> {

    List<NamesOnlyRecord> findByFirstName(String lastName);

    List<NamesOnlyRecord> findAllByFirstNameContaining(String name);

    @Query("""
            SELECT new com.example.springboot.recordprojection.NamesOnlyRecord(e.firstName, e.lastName)
            FROM Employee e
            WHERE e.firstName LIKE :name
            """)
    List<NamesOnlyRecord> record(String name);
}
