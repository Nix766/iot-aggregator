package com.cleverlance.academy.aggregator.service;

import com.cleverlance.academy.aggregator.model.WeatherValues;

import java.util.List;

public interface WeatherValuesService {

    List<WeatherValues> getValues();
    Void saveValues(WeatherValues values);

}
