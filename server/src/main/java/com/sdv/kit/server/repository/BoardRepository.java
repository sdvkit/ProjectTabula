package com.sdv.kit.server.repository;

import com.sdv.kit.server.model.Board;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardRepository extends JpaRepository<Board, Long> {
}