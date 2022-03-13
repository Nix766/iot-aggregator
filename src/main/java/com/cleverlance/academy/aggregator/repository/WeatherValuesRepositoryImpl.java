package com.cleverlance.academy.aggregator.repository;

import com.cleverlance.academy.aggregator.model.WeatherValues;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class WeatherValuesRepositoryImpl implements WeatherValuesRepository{

    private ArrayList<WeatherValues> list = new ArrayList<>();

    @Override
    public List<WeatherValues> getValues() {
        return this.list;
    }

    @Override
    public Void saveValues(WeatherValues values) {
        this.list.add(values);
        return null;
    }



}
