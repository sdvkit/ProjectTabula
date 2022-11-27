package com.sdv.kit.server.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class PersonReadDto implements Serializable {
    private final String name;
    private final JobRoleReadDto jobRole;
}