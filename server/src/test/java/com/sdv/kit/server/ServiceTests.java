package com.sdv.kit.server;

import com.sdv.kit.server.model.JobRole;
import com.sdv.kit.server.service.JobRoleService;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class ServiceTests {

    private final JobRoleService jobRoleService;

    private final Logger logger = LoggerFactory.getLogger(ServiceTests.class);

    @Autowired
    ServiceTests(JobRoleService jobRoleService) {
        this.jobRoleService = jobRoleService;
    }

    @Test
    void checkJobRoleService() {
        List<JobRole> jobRoles = jobRoleService.findAll();
        jobRoles.forEach(jobRole -> logger.info(jobRole.getTitle()));
        assertEquals(12, jobRoles.size());
    }
}
