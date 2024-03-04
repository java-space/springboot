/*
 * Copyright 2023 , All Rights Reserved
 * Licensed under the Apache License, Version 2.0 (the "License");
 * Unauthorized copying of this file, via any medium is strictly prohibited.
 * Proprietary and confidential
 * @author  Mothusi Molorane
 * @since 1.0
 */

package com.example.springboot.mapper;

import com.example.springboot.entity.Address;
import com.example.springboot.model.AddressDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(unmappedTargetPolicy = ReportingPolicy.ERROR)
public interface AddressMapper {

    AddressMapper INSTANCE = Mappers.getMapper(AddressMapper.class);

    AddressDTO internalToDto(Address address);

    @Mapping(target = "employee", ignore = true )
    Address dtoToInternal(AddressDTO addressDTO);

    List<AddressDTO> internalsToDTOs(List<Address> addresses);
}
