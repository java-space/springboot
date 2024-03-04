/*
 * Copyright 2023 , All Rights Reserved
 * Licensed under the Apache License, Version 2.0 (the "License");
 * Unauthorized copying of this file, via any medium is strictly prohibited.
 * Proprietary and confidential
 * @author  Mothusi Molorane
 * @since 1.0
 */

package com.example.springboot.mapper;

import com.example.springboot.entity.Employee;
import com.example.springboot.model.EmployeeDTO;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(unmappedTargetPolicy = ReportingPolicy.ERROR, uses = {AddressMapper.class})
public interface EmployeeMapper {

    EmployeeMapper INSTANCE = Mappers.getMapper(EmployeeMapper.class);

    EmployeeDTO internalToDto(Employee employee);

    Employee dtoToInternal(EmployeeDTO employeeDTO);

    List<EmployeeDTO> internalsToDTOs(List<Employee> employees);
}
