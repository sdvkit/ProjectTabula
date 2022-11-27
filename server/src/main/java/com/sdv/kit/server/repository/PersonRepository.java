package com.sdv.kit.server.repository;

import com.sdv.kit.server.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
}