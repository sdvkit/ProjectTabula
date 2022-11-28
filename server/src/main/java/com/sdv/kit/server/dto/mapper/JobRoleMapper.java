package com.sdv.kit.server.dto.mapper;

import com.sdv.kit.server.dto.read.JobRoleReadDto;
import com.sdv.kit.server.model.JobRole;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface JobRoleMapper {

    JobRoleMapper INSTANCE = Mappers.getMapper(JobRoleMapper.class);

    JobRoleReadDto toReadDto(JobRole jobRole);
    List<JobRoleReadDto> toReadDto(Iterable<JobRole> jobRoles);

    JobRole fromReadDto(JobRoleReadDto jobRoleReadDto);
    List<JobRole> fromReadDto(Iterable<JobRoleReadDto> jobRoleReadDtos);
}
