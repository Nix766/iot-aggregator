package com.cleverlance.academy.aggregator.controller.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.openapitools.model.Identification;

@Mapper
public interface IdentificationMapper {


    Identification toIdentification(com.cleverlance.academy.aggregator.model.Identification identification);
}
