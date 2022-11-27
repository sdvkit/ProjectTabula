package com.sdv.kit.server.util.mapper;

import com.sdv.kit.server.dto.PersonReadDto;
import com.sdv.kit.server.model.Person;
import org.mapstruct.BeanMapping;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;
import org.mapstruct.factory.Mappers;

@Mapper
public interface PersonMapper {

    PersonMapper INSTANCE = Mappers.getMapper(PersonMapper.class);

    Person personReadDtoToPerson(PersonReadDto personReadDto);

    PersonReadDto personToPersonReadDto(Person person);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Person updatePersonFromPersonReadDto(PersonReadDto personReadDto, @MappingTarget Person person);
}
