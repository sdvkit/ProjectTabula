package com.sdv.kit.server.dto.mapper;

import com.sdv.kit.server.dto.read.TaskGroupReadDto;
import com.sdv.kit.server.model.TaskGroup;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface TaskGroupMapper {

    TaskGroupMapper INSTANCE = Mappers.getMapper(TaskGroupMapper.class);

    TaskGroupReadDto toReadDto(TaskGroup taskGroup);
    List<TaskGroupReadDto> toReadDto(Iterable<TaskGroup> taskGroups);

    TaskGroup fromReadDto(TaskGroupReadDto taskGroupReadDto);
    List<TaskGroup> fromReadDto(Iterable<TaskGroupReadDto> taskGroupReadDtos);
}
