package com.cleverlance.academy.aggregator.controller;

import com.cleverlance.academy.aggregator.controller.model.Address;
import com.cleverlance.academy.aggregator.controller.model.Identification;
import com.cleverlance.academy.aggregator.controller.model.Person;
import lombok.extern.slf4j.Slf4j;
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

    @GetMapping(path = "/identification")
    public ResponseEntity<Identification> welcome() {
        return ResponseEntity.ok(new Identification("Moje meteostanice",
                                                    new Address("Čáslavská", "1793/15", "Praha 3"),
                                                    new Person("Šárka", "Dlouhá")));
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



}
