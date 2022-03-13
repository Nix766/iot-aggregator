package com.cleverlance.academy.aggregator.repository;

import com.cleverlance.academy.aggregator.model.Identification;
import com.cleverlance.academy.aggregator.model.Person;
import com.cleverlance.academy.aggregator.model.Address;
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
