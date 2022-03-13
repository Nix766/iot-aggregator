package com.cleverlance.academy.iotServer.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.assertj.core.internal.bytebuddy.matcher.ElementMatchers.is;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;

@SpringBootTest
@AutoConfigureMockMvc
class WeatherValuesControllerTest {

    @Autowired
    private MockMvc mockMvc;
    @Test
    void test() throws Exception {

        // test ulozeni a vraceni hodnot z meteostanice
        this.mockMvc.perform(post("/data").contentType("application/json")
                .content("{\"temperature\": \"20\", \"humidity\": \"47\", \"pressure\": \"50\", \"light\": \"60\"}")).andExpect(status().isOk());
        this.mockMvc.perform(get("/data")).andDo(print())
                .andExpect(status().isOk())
                .andExpect(jsonPath("$[0].temperature").value("20"))
                .andExpect(jsonPath("$[0].humidity").value("47"))
                .andExpect(jsonPath("$[0].pressure").value("50"))
                .andExpect(jsonPath("$[0].light").value("60"));

    }

}