package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.math.BigDecimal;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * MeteoData
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-03-13T11:20:17.516825200+01:00[Europe/Prague]")
public class MeteoData   {

  @JsonProperty("humidity")
  private BigDecimal humidity;

  @JsonProperty("temperature")
  private BigDecimal temperature;

  @JsonProperty("light")
  private BigDecimal light;

  @JsonProperty("pressure")
  private BigDecimal pressure;

  public MeteoData humidity(BigDecimal humidity) {
    this.humidity = humidity;
    return this;
  }

  /**
   * Get humidity
   * @return humidity
  */
  @NotNull @Valid 
  @Schema(name = "humidity", required = true)
  public BigDecimal getHumidity() {
    return humidity;
  }

  public void setHumidity(BigDecimal humidity) {
    this.humidity = humidity;
  }

  public MeteoData temperature(BigDecimal temperature) {
    this.temperature = temperature;
    return this;
  }

  /**
   * Temperature in C
   * @return temperature
  */
  @NotNull @Valid 
  @Schema(name = "temperature", description = "Temperature in C", required = true)
  public BigDecimal getTemperature() {
    return temperature;
  }

  public void setTemperature(BigDecimal temperature) {
    this.temperature = temperature;
  }

  public MeteoData light(BigDecimal light) {
    this.light = light;
    return this;
  }

  /**
   * Get light
   * @return light
  */
  @NotNull @Valid 
  @Schema(name = "light", required = true)
  public BigDecimal getLight() {
    return light;
  }

  public void setLight(BigDecimal light) {
    this.light = light;
  }

  public MeteoData pressure(BigDecimal pressure) {
    this.pressure = pressure;
    return this;
  }

  /**
   * Get pressure
   * @return pressure
  */
  @NotNull @Valid 
  @Schema(name = "pressure", required = true)
  public BigDecimal getPressure() {
    return pressure;
  }

  public void setPressure(BigDecimal pressure) {
    this.pressure = pressure;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MeteoData meteoData = (MeteoData) o;
    return Objects.equals(this.humidity, meteoData.humidity) &&
        Objects.equals(this.temperature, meteoData.temperature) &&
        Objects.equals(this.light, meteoData.light) &&
        Objects.equals(this.pressure, meteoData.pressure);
  }

  @Override
  public int hashCode() {
    return Objects.hash(humidity, temperature, light, pressure);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MeteoData {\n");
    sb.append("    humidity: ").append(toIndentedString(humidity)).append("\n");
    sb.append("    temperature: ").append(toIndentedString(temperature)).append("\n");
    sb.append("    light: ").append(toIndentedString(light)).append("\n");
    sb.append("    pressure: ").append(toIndentedString(pressure)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

