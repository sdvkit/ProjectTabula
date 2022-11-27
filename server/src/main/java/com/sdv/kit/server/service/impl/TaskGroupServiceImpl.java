package com.sdv.kit.server.service.impl;

import com.sdv.kit.server.repository.TaskGroupRepository;
import com.sdv.kit.server.service.TaskGroupService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class TaskGroupServiceImpl implements TaskGroupService {

    private final TaskGroupRepository taskGroupRepository;
}
