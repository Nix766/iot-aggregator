package com.cleverlance.academy.iotServer.service;

import com.cleverlance.academy.iotServer.model.WeatherValues;
import com.cleverlance.academy.iotServer.repository.WeatherValuesRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WeatherValuesServiceImpl implements WeatherValuesService{

    private WeatherValuesRepository weatherValuesRepository;

    public WeatherValuesServiceImpl(WeatherValuesRepository weatherValuesRepository) {
        this.weatherValuesRepository = weatherValuesRepository;
    }

    @Override
    public List<WeatherValues> getValues() {
        return this.weatherValuesRepository.getValues();
    }

    @Override
    public Void saveValues(WeatherValues values) {
        this.weatherValuesRepository.saveValues(values);
        return null;
    }
}
