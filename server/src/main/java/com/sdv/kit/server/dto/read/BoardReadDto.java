package com.sdv.kit.server.dto.read;

import java.util.List;

public record BoardReadDto(String name,
                           List<PersonReadDto> people,
                           PersonReadDto creator) { }