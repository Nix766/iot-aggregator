package com.cleverlance.academy.iotServer.service;

import com.cleverlance.academy.iotServer.model.WeatherValues;
import com.cleverlance.academy.iotServer.repository.JpaWeatherValuesRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WeatherValuesServiceImpl implements WeatherValuesService{

    private JpaWeatherValuesRepository jpaWeatherValuesRepository;

    public WeatherValuesServiceImpl(JpaWeatherValuesRepository weatherValuesRepository) {
        this.jpaWeatherValuesRepository = weatherValuesRepository;
    }

    @Override
    public List<WeatherValues> getValues(Integer pageSize, Integer pageNumber) {
        return this.jpaWeatherValuesRepository.findAll();
    }

    @Override
    public void saveValues(WeatherValues values) {
                                    // uloz a commitni
        this.jpaWeatherValuesRepository.saveAndFlush(values);

    }
}
