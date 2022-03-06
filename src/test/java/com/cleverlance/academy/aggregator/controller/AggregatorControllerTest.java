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
        this.mockMvc.perform(post("/server").contentType("application/json")
                .content("{\"name\": \"aaa\", \"address.street\": \"caslavska\"}")).andExpect(status().isOk());
        this.mockMvc.perform(get("/server")).andDo(print())
                .andExpect(status().isOk())
                .andExpect(jsonPath("$[0].name").value("aaa"))
 //               .andExpect(jsonPath("$[0].address.street").value("aaa"))
        ;

    }

}