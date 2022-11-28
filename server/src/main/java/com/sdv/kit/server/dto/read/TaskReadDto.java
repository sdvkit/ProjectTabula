package com.sdv.kit.server.dto.read;

import java.time.LocalDate;

public record TaskReadDto(String title,
                          String description,
                          LocalDate creationDate,
                          LocalDate expirationDate,
                          TaskGroupReadDto taskGroup) { }
