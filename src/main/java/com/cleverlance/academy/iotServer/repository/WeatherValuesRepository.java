package com.cleverlance.academy.iotServer.repository;

import com.cleverlance.academy.iotServer.model.WeatherValues;

import java.util.List;

public interface WeatherValuesRepository {

    List<WeatherValues> getValues();
    Void saveValues(WeatherValues values);
}
