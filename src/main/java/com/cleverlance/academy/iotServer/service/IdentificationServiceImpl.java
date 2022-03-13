package com.cleverlance.academy.iotServer.service;

import com.cleverlance.academy.iotServer.model.Identification;
import com.cleverlance.academy.iotServer.repository.IdentificationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IdentificationServiceImpl implements IdentificationService {

    @Autowired
    private IdentificationRepository identificationRepository;

    @Override
    public Identification getIdentification() {
        return this.identificationRepository.getIdentification();
    }
}
