package com.cleverlance.academy.iotServer.controller.mapper;

import org.mapstruct.Mapper;
import org.openapitools.model.Identification;

@Mapper
public interface IdentificationMapper {


    Identification toIdentification(com.cleverlance.academy.iotServer.model.Identification identification);
}
