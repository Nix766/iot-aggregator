package com.cleverlance.academy.aggregator.controller;

import com.cleverlance.academy.aggregator.model.Identification;
import com.cleverlance.academy.aggregator.model.Person;
import com.cleverlance.academy.aggregator.model.WeatherValues;
import com.cleverlance.academy.aggregator.service.PersonService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@RestController
public class AggregatorController {

    private final List<Identification> identifications = new ArrayList<>();
    private final List<WeatherValues> weatherValues = new ArrayList<>();

    private final PersonService personService;

    public AggregatorController(PersonService personService) {
        this.personService = personService;
    }



// registrace moji aplikace pro agregator
    @PostMapping("/server")            // musime springu rict, ze identification je to, co prijde v tele zpravy
    public ResponseEntity<Void> saveServer(@RequestBody Identification identification) {
                                        // placeholder
        log.info("Server identification {}", identification);
        this.identifications.add(identification);
                                    // pokud volam metodu ok bez vstupni promenne, musim jeste zavolat build
        return ResponseEntity.ok().build();
    }

    @GetMapping("/server")
    public ResponseEntity<List<Identification>> getIdentifications() {
        return ResponseEntity.ok(this.identifications);
    }


    @PostMapping("/person")
    public ResponseEntity<Void> savePerson(@RequestBody Person person) {

        return ResponseEntity.ok().build();
    }

}
