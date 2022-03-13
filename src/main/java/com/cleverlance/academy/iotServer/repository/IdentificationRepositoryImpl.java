package com.cleverlance.academy.iotServer.repository;

import com.cleverlance.academy.iotServer.model.Identification;
import com.cleverlance.academy.iotServer.model.Person;
import com.cleverlance.academy.iotServer.model.Address;
import org.springframework.stereotype.Component;

@Component
public class IdentificationRepositoryImpl implements IdentificationRepository {


    @Override
    public Identification getIdentification() {
        return new Identification("Moje meteostanice sarka",
                                  new Address("caslavska", "1", "Praha"),
                                  new Person("sarka", "dlouha", "sarkadlouha89@gmail.com", "FEMALE"));
    }
}
