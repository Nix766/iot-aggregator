package com.cleverlance.academy.iotServer.service;

import com.cleverlance.academy.iotServer.model.WeatherValues;

import java.util.List;

public interface WeatherValuesService {

    List<WeatherValues> getValues();
    void saveValues(WeatherValues values);

}
