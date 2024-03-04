package com.example.springboot.repos;

import com.example.springboot.dtoprojection.NamesOnlyDTO;
import com.example.springboot.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface EmployeeRepoDtoP extends JpaRepository<Employee, Integer> {

    @Query("""
            SELECT new com.example.springboot.dtoprojection.NamesOnlyDTO(e.firstName,e.lastName)
            FROM Employee e
            WHERE e.firstName LIKE :name
            """)
    List<NamesOnlyDTO> dtoProjection(String name);

    List<NamesOnlyDTO> findByFirstName(String lastName);
}
