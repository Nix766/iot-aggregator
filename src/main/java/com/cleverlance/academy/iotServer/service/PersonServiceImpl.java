package com.cleverlance.academy.iotServer.service;

import com.cleverlance.academy.iotServer.model.Person;
import org.springframework.stereotype.Service;

import javax.validation.Valid;

@Service
public class PersonServiceImpl implements  PersonService{

    @Override
    public void savePerson(@Valid Person person) {
        System.out.println("ukladame osobu");
    }
}
