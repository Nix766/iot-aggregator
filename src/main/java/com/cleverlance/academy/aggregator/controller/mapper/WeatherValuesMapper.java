package com.cleverlance.academy.aggregator.controller.mapper;

import com.cleverlance.academy.aggregator.model.WeatherValues;
import org.mapstruct.Mapper;
import org.openapitools.model.MeteoData;

import java.util.List;

@Mapper
public interface WeatherValuesMapper {

    MeteoData toMeteoData(WeatherValues weatherValues);

    WeatherValues toWeatherValues(MeteoData meteoData);

    List<MeteoData> toMeteoData(List<WeatherValues> weatherValues);
}
