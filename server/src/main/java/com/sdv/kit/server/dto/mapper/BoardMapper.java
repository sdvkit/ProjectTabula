package com.sdv.kit.server.dto.mapper;

import com.sdv.kit.server.dto.read.BoardReadDto;
import com.sdv.kit.server.model.Board;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface BoardMapper {

    BoardMapper INSTANCE = Mappers.getMapper(BoardMapper.class);

    BoardReadDto toReadDto(Board board);
    List<BoardReadDto> toReadDto(Iterable<Board> boards);

    Board fromReadDto(BoardReadDto boardReadDto);
    List<Board> fromReadDto(Iterable<BoardReadDto> boardReadDtos);
}
