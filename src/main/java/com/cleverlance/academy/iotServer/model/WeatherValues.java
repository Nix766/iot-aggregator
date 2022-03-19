package com.cleverlance.academy.iotServer.model;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.Instant;

@Data
@Entity
@Table(name = "weather_values")
public class WeatherValues {

        @Id
        @GeneratedValue
        private Integer id;
        private long temperature;
        private long humidity;
        private long pressure;
        private long light;
        private Instant createdDate;

        public WeatherValues(long temperature, long humidity, long pressure, long light) {
                this.temperature = temperature;
                this.humidity = humidity;
                this.pressure = pressure;
                this.light = light;
                this.createdDate = Instant.now();
        }

        @Autowired
        public WeatherValues() {
                this.createdDate = Instant.now();
        }


}
