package com.sdv.kit.server.dto.read;

import com.sdv.kit.server.dto.read.BoardReadDto;

public record TaskGroupReadDto (String name,
                                BoardReadDto board) { }
