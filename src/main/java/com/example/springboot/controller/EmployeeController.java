package com.example.springboot.controller;

import com.example.springboot.mapper.EmployeeMapper;
import com.example.springboot.model.EmployeeDTO;
import com.example.springboot.repos.EmployeeRepo;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@AllArgsConstructor
public class EmployeeController implements EmployeeApiDelegate {

    private EmployeeRepo employeeRepo;

    @Override
    public ResponseEntity<List<EmployeeDTO>> getEmployees() {
        return ResponseEntity.ok(
                EmployeeMapper.INSTANCE.internalsToDTOs(
                        employeeRepo.findAll()
                )
        );
    }

    @Override
    public ResponseEntity<List<EmployeeDTO>> findEmployeesByName(String name) {
        return ResponseEntity.ok(
                EmployeeMapper.INSTANCE.internalsToDTOs(
                        employeeRepo.findByFirstName(name)
                )
        );
    }

    @Override
    public ResponseEntity<EmployeeDTO> findEmployeeById(Long id) {
        return ResponseEntity.ok(
                EmployeeMapper.INSTANCE.internalToDto(
                        employeeRepo.findById(id.intValue()).orElseThrow(() -> new RuntimeException("Employee not found"))
                )
        );
    }

    @Override
    public ResponseEntity<List<EmployeeDTO>> findEmployeesByProvince(String province) {
        return ResponseEntity.ok(
                EmployeeMapper.INSTANCE.internalsToDTOs(
                        employeeRepo.findFirst20ByAddresses_ProvinceContaining(province)
                )
        );
    }

    @Override
    public ResponseEntity<Void> addEmployee(EmployeeDTO employeeDTO) {
        employeeRepo.save(
                EmployeeMapper.INSTANCE.dtoToInternal(employeeDTO)
        );
        return ResponseEntity.ok().build();
    }

    @Override
    public ResponseEntity<Void> deleteEmployee(Long id) {
        employeeRepo.deleteById(id.intValue());
        return ResponseEntity.noContent().build();
    }
}
