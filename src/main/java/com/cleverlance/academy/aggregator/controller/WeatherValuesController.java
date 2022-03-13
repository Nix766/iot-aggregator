package com.cleverlance.academy.aggregator.controller;

import com.cleverlance.academy.aggregator.controller.mapper.WeatherValuesMapper;
import com.cleverlance.academy.aggregator.model.WeatherValues;
import com.cleverlance.academy.aggregator.service.WeatherValuesService;
import org.openapitools.api.DataApi;
import org.openapitools.model.MeteoData;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class WeatherValuesController implements DataApi {

    private WeatherValuesService weatherValuesService;
    private WeatherValuesMapper weatherValuesMapper;

    public WeatherValuesController(WeatherValuesService weatherValuesService, WeatherValuesMapper weatherValuesMapper) {
        this.weatherValuesService = weatherValuesService;
        this.weatherValuesMapper = weatherValuesMapper;
    }

    @Override
    public ResponseEntity<List<MeteoData>> getData() {
        List<WeatherValues> weatherValues = this.weatherValuesService.getValues();
        return ResponseEntity.ok(weatherValuesMapper.toMeteoData(weatherValues));

    }

    @Override
    public ResponseEntity<Void> saveData(MeteoData meteoData) {
        WeatherValues weatherValues = weatherValuesMapper.toWeatherValues(meteoData);
        this.weatherValuesService.saveValues(weatherValues);
        return ResponseEntity.ok().build();
    }
}
