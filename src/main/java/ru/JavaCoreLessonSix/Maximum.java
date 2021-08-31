package ru.JavaCoreLessonSix;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;



@JsonIgnoreProperties(ignoreUnknown = true)
public class Maximum {

    @JsonProperty("Value")
    private Double value;
    @JsonProperty("Unit")
    private String unit;

    public Maximum() {
    }

    public Maximum(Double value, String unit) {
        this.value = value;
        this.unit = unit;
    }

    @Override
    public String toString() {
        return "Maximum{" +
                "value='" + value + '\'' +
                ", unit='" + unit + '\'' +
                '}';
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }
}