package com.cleverlance.academy.iotServer.model;

import lombok.Value;

@Value
public class WeatherValues {

        private long temperature;
        private long humidity;
        private long pressure;
        private long light;
}
