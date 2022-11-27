package com.sdv.kit.server.repository;

import com.sdv.kit.server.model.Person;
import com.sdv.kit.server.model.PersonCredentials;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonCredentialsRepository extends JpaRepository<PersonCredentials, Person> {
}