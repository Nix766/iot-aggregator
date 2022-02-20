package com.cleverlance.academy.aggregator.controller;

import com.cleverlance.academy.aggregator.controller.model.Address;
import com.cleverlance.academy.aggregator.controller.model.Identification;
import com.cleverlance.academy.aggregator.controller.model.Person;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AggregatorController {

    @GetMapping(path = "/identification")
    public ResponseEntity<Identification> welcome() {
        return ResponseEntity.ok(new Identification("Moje meteostanice",
                                                    new Address("Čáslavská", "1793/15", "Praha 3"),
                                                    new Person("Šárka", "Dlouhá")));
    }
}
