package com.sdv.kit.server.repository;

import com.sdv.kit.server.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {
}