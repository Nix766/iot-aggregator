package com.cleverlance.academy.iotServer.model;

import lombok.Value;

@Value
public class Identification {

    private String name;
    private Address address;
    private Person owner;

}
