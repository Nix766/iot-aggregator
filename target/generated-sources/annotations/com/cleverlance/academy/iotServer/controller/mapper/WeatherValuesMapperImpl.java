package com.cleverlance.academy.iotServer.controller.mapper;

import com.cleverlance.academy.iotServer.model.WeatherValues;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.openapitools.model.MeteoData;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-03-13T11:20:24+0100",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 11.0.11 (Amazon.com Inc.)"
)
@Component
public class WeatherValuesMapperImpl implements WeatherValuesMapper {

    @Override
    public MeteoData toMeteoData(WeatherValues weatherValues) {
        if ( weatherValues == null ) {
            return null;
        }

        MeteoData meteoData = new MeteoData();

        meteoData.setHumidity( BigDecimal.valueOf( weatherValues.getHumidity() ) );
        meteoData.setTemperature( BigDecimal.valueOf( weatherValues.getTemperature() ) );
        meteoData.setLight( BigDecimal.valueOf( weatherValues.getLight() ) );
        meteoData.setPressure( BigDecimal.valueOf( weatherValues.getPressure() ) );

        return meteoData;
    }

    @Override
    public WeatherValues toWeatherValues(MeteoData meteoData) {
        if ( meteoData == null ) {
            return null;
        }

        long temperature = 0L;
        long humidity = 0L;
        long pressure = 0L;
        long light = 0L;

        if ( meteoData.getTemperature() != null ) {
            temperature = meteoData.getTemperature().longValue();
        }
        if ( meteoData.getHumidity() != null ) {
            humidity = meteoData.getHumidity().longValue();
        }
        if ( meteoData.getPressure() != null ) {
            pressure = meteoData.getPressure().longValue();
        }
        if ( meteoData.getLight() != null ) {
            light = meteoData.getLight().longValue();
        }

        WeatherValues weatherValues = new WeatherValues( temperature, humidity, pressure, light );

        return weatherValues;
    }

    @Override
    public List<MeteoData> toMeteoData(List<WeatherValues> weatherValues) {
        if ( weatherValues == null ) {
            return null;
        }

        List<MeteoData> list = new ArrayList<MeteoData>( weatherValues.size() );
        for ( WeatherValues weatherValues1 : weatherValues ) {
            list.add( toMeteoData( weatherValues1 ) );
        }

        return list;
    }
}
