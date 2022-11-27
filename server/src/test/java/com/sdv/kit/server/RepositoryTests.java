package com.sdv.kit.server;

import com.sdv.kit.server.model.JobRole;
import com.sdv.kit.server.repository.JobRoleRepository;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class RepositoryTests {

    private final JobRoleRepository jobRoleRepository;

    private final Logger logger = LoggerFactory.getLogger(RepositoryTests.class);

    @Autowired
    RepositoryTests(JobRoleRepository jobRoleRepository) {
        this.jobRoleRepository = jobRoleRepository;
    }

    @Test
    void checkJonRoles() {
        List<JobRole> jobRoles = jobRoleRepository.findAll();
        jobRoles.forEach(jobRole -> logger.info(jobRole.getTitle()));
        assertEquals(12, jobRoles.size());
    }
}
