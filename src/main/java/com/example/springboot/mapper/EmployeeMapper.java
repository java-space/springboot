/*
 * Copyright 2023 , All Rights Reserved
 * Licensed under the Apache License, Version 2.0 (the "License");
 * Unauthorized copying of this file, via any medium is strictly prohibited.
 * Proprietary and confidential
 * @author  Mothusi Molorane
 * @since 1.0
 */

package com.example.springboot.mapper;

import com.example.springboot.controller.Employee;
import com.example.springboot.dto.EmployeeDTO;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(unmappedTargetPolicy = ReportingPolicy.ERROR, uses = {AddressMapper.class})
public interface EmployeeMapper {

    EmployeeMapper INSTANCE = Mappers.getMapper(EmployeeMapper.class);

    Employee internalToDto(EmployeeDTO employeeDTO);

    EmployeeDTO dtoToInternal(Employee account);

    List<EmployeeDTO> internalsToDTOs(List<Employee> employees);
}
