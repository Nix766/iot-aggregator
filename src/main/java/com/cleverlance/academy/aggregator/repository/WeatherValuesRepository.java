package com.cleverlance.academy.aggregator.repository;

import com.cleverlance.academy.aggregator.model.WeatherValues;

import java.util.List;

public interface WeatherValuesRepository {

    List<WeatherValues> getValues();
    Void saveValues(WeatherValues values);
}
