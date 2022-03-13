package com.cleverlance.academy.aggregator.controller;

import com.cleverlance.academy.aggregator.controller.mapper.IdentificationMapper;
import com.cleverlance.academy.aggregator.service.IdentificationService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.openapitools.api.IdentificationApi;
import org.openapitools.model.Identification;

@RestController
public class IdentificationController implements IdentificationApi {


    private IdentificationService identificationService;
    private IdentificationMapper identificationMapper;

    public IdentificationController(IdentificationService identificationService, IdentificationMapper identificationMapper) {
        this.identificationService = identificationService;
        this.identificationMapper = identificationMapper;
    }


    @Override
    public ResponseEntity<Identification> getIdentification() {
        com.cleverlance.academy.aggregator.model.Identification identification = this.identificationService.getIdentification();
        return ResponseEntity.ok(identificationMapper.toIdentification(identification));
    }
}
