package com.sdv.kit.server.dto.read;

import com.sdv.kit.server.dto.read.JobRoleReadDto;
import com.sdv.kit.server.model.PersonCredentials;

import java.time.LocalDate;

public record PersonReadDto(String name,
                            String phone,
                            Integer workExperience,
                            LocalDate dateOfBirthday,
                            JobRoleReadDto jobRole,
                            PersonCredentials personCredentials) { }
