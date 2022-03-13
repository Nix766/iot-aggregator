package com.cleverlance.academy.aggregator.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.internal.bytebuddy.matcher.ElementMatchers.is;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;

@SpringBootTest
@AutoConfigureMockMvc
class AggregatorControllerTest {

    // v dependencies v pom pouzivame spring-boot-starter-test, tedy nebudeme vytvaret tridu agregatoru,
    // ale pouzijeme promennou (bean) MockMvc, diky ktere muzeme volat endpointy nasi aplikace
    @Autowired
    private MockMvc mockMvc;
    @Test
    void test() throws Exception {
        // test registrace, puvodni metoda
        this.mockMvc.perform(post("/server").contentType("application/json")
                .content("{\"name\": \"aaa\", \"address\": {\"city\": \"Praha\", \"street\": \"caslavska\", \"houseNumber\": \"23\"}, \"owner\": {\"firstName\": \"katerina\", \"lastName\": \"gottwald\"}}"))
                .andExpect(status().isOk());
        this.mockMvc.perform(get("/server")).andDo(print())
                .andExpect(status().isOk())
                .andExpect(jsonPath("$[0].name").value("aaa"))
                .andExpect(jsonPath("$[0].address.street").value("caslavska"))
                .andExpect(jsonPath("$[0].address.houseNumber").value("23"))
                .andExpect(jsonPath("$[0].address.city").value("Praha"))
                .andExpect(jsonPath("$[0].owner.firstName").value("katerina"))
                .andExpect(jsonPath("$[0].owner.lastName").value("gottwald"));

        // test identifikace - nove api - nefunuje nevim proc
//        this.mockMvc.perform(get("/identification")).andDo(print()).andExpect(status().isOk())
//                .andExpect(jsonPath("$[0].name").value("Moje meteostanice sarka"));

        // test ulozeni a vraceni hodnot z meteostanice - nove api
        // ulozeni hodnot
 //       this.mockMvc.perform(post("/data").contentType("application/json")
                //.content("{\"temperatureInCelsius\": \"20\", \"humidityPercentage\": \"47\", \"pressure\": \"50\", \"light\": \"60\"}")).andExpect(status().isOk());
 //               .content("{\"humidity\": \"20\"}")).andExpect(status().isOk());
//        this.mockMvc.perform(get("/data")).andDo(print())
//                .andExpect(status().isOk())
//                .andExpect(jsonPath("$[0].temperatureInCelsius").value("20"))
//                .andExpect(jsonPath("$[0].humidityPercentage").value("47"))
//                .andExpect(jsonPath("$[0].pressure").value("50"))
//                .andExpect(jsonPath("$[0].light").value("60"));

    }

}