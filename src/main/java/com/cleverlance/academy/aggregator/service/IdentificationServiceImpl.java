package com.cleverlance.academy.aggregator.service;

import com.cleverlance.academy.aggregator.model.Identification;
import com.cleverlance.academy.aggregator.repository.IdentificationRepository;
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
