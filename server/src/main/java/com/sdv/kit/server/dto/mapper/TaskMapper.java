package com.sdv.kit.server.dto.mapper;

import com.sdv.kit.server.dto.read.TaskReadDto;
import com.sdv.kit.server.model.Task;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface TaskMapper {

    TaskMapper INSTANCE = Mappers.getMapper(TaskMapper.class);

    TaskReadDto toReadDto(Task task);
    List<TaskReadDto> toReadDto(Iterable<Task> tasks);

    Task fromReadDto(TaskReadDto taskReadDto);
    List<Task> fromReadDto(Iterable<TaskReadDto> taskReadDtos);
}
