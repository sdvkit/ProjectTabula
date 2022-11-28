package com.sdv.kit.server.dto.mapper;

import com.sdv.kit.server.dto.read.PersonReadDto;
import com.sdv.kit.server.model.Person;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface PersonMapper {

    PersonMapper INSTANCE = Mappers.getMapper(PersonMapper.class);

    PersonReadDto toReadDto(Person person);
    List<PersonReadDto> toReadDto(Iterable<Person> people);

    Person fromReadDto(PersonReadDto personReadDto);
    List<Person> fromReadDto(Iterable<PersonReadDto> personReadDtos);
}
