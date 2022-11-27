package com.sdv.kit.server.service.impl;

import com.sdv.kit.server.repository.PersonCredentialsRepository;
import com.sdv.kit.server.service.PersonCredentialsService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class PersonCredentialsServiceImpl implements PersonCredentialsService {

    private final PersonCredentialsRepository personCredentialsRepository;
}
