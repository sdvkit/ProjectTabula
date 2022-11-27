package com.sdv.kit.server.service;

import com.sdv.kit.server.model.JobRole;
import org.springframework.stereotype.Service;

import java.util.List;

public interface JobRoleService {

    List<JobRole> findAll();
}
