package com.cleverlance.academy.iotServer.repository;

import com.cleverlance.academy.iotServer.model.WeatherValues;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JpaWeatherValuesRepository extends JpaRepository<WeatherValues, Integer> {

}
