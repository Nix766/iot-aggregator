package com.cleverlance.academy.iotServer.controller.mapper;

import com.cleverlance.academy.iotServer.model.WeatherValues;
import org.junit.jupiter.api.Test;
import org.mapstruct.factory.Mappers;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class WeatherValuesMapperTest{

    private static final WeatherValuesMapper MAPPER = Mappers.getMapper(WeatherValuesMapper.class);
    @Test
    void toMeteodata() {
        WeatherValues weatherValues = new WeatherValues(20, 30, 40, 50);

        org.openapitools.model.MeteoData converted = MAPPER.toMeteoData(weatherValues);
        assertEquals(new BigDecimal(20), converted.getTemperature());
        assertEquals(new BigDecimal(30), converted.getHumidity());
        assertEquals(new BigDecimal(40), converted.getPressure());
        assertEquals(new BigDecimal(50), converted.getLight());
    }
}