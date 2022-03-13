package com.cleverlance.academy.iotServer.controller.mapper;

import com.cleverlance.academy.iotServer.model.Identification;
import com.cleverlance.academy.iotServer.model.Person;
import javax.annotation.processing.Generated;
import org.openapitools.model.Address;
import org.openapitools.model.Owner;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-03-13T11:20:24+0100",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 11.0.11 (Amazon.com Inc.)"
)
@Component
public class IdentificationMapperImpl implements IdentificationMapper {

    @Override
    public org.openapitools.model.Identification toIdentification(Identification identification) {
        if ( identification == null ) {
            return null;
        }

        org.openapitools.model.Identification identification1 = new org.openapitools.model.Identification();

        identification1.setName( identification.getName() );
        identification1.setOwner( personToOwner( identification.getOwner() ) );
        identification1.setAddress( addressToAddress( identification.getAddress() ) );

        return identification1;
    }

    protected Owner personToOwner(Person person) {
        if ( person == null ) {
            return null;
        }

        Owner owner = new Owner();

        owner.setFirstName( person.getFirstName() );
        owner.setLastName( person.getLastName() );

        return owner;
    }

    protected Address addressToAddress(com.cleverlance.academy.iotServer.model.Address address) {
        if ( address == null ) {
            return null;
        }

        Address address1 = new Address();

        address1.setStreet( address.getStreet() );
        address1.setHouseNumber( address.getHouseNumber() );
        address1.setCity( address.getCity() );

        return address1;
    }
}
