package com.sdv.kit.server.service.impl;

import com.sdv.kit.server.repository.JobRoleRepository;
import com.sdv.kit.server.service.JobRoleService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class JobRoleServiceImpl implements JobRoleService {

    private final JobRoleRepository jobRoleRepository;
}
