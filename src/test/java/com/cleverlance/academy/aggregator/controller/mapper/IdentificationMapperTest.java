package com.cleverlance.academy.aggregator.controller.mapper;

import com.cleverlance.academy.aggregator.model.Address;
import com.cleverlance.academy.aggregator.model.Identification;
import com.cleverlance.academy.aggregator.model.Person;
import org.junit.jupiter.api.Test;
import org.mapstruct.factory.Mappers;

import static org.junit.jupiter.api.Assertions.*;

class IdentificationMapperTest {

    private static final IdentificationMapper MAPPER = Mappers.getMapper(IdentificationMapper.class);
    @Test
    void toIdentification() {
        Identification identification = new Identification("Moje meteostanice sarka",
                new Address("caslavska", "1", "Praha"),
                new Person("sarka", "dlouha", "sarkadlouha89@gmail.com", "FEMALE"));

        org.openapitools.model.Identification converted = MAPPER.toIdentification(identification);
        assertEquals("Moje meteostanice sarka", converted.getName());
        assertEquals("caslavska", converted.getAddress().getStreet());
        assertEquals("1", converted.getAddress().getHouseNumber());
        assertEquals("Praha", converted.getAddress().getCity());
        assertEquals("sarka", converted.getOwner().getFirstName());
        assertEquals("dlouha", converted.getOwner().getLastName());
    }
}