package ru.JavaCoreLessonSix.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class DailyForecasts {
    @JsonProperty("Date")
    private String date;
    @JsonProperty("Temperature")
    private Temperature temperature;
    @JsonProperty("Day")
    private Day day;
    @JsonProperty("Night")
    private Night night;



    public DailyForecasts() {
    }

    public DailyForecasts(String date, Temperature temperature, Day day, Night night) {
        this.date = date;
        this.temperature = temperature;
        this.day = day;
        this.night = night;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Temperature getTemperature() {
        return temperature;
    }

    public void setTemperature(Temperature temperature) {
        this.temperature = temperature;
    }

    public Day getDay() {
        return day;
    }

    public void setDay(Day day) {
        this.day = day;
    }

    public Night getNight() {
        return night;
    }

    public void setNight(Night night) {
        this.night = night;
    }

    @Override
    public String toString() {
        return "DailyForecasts{" +
                "date='" + date + '\'' +
                ", temperature=" + temperature +
                ", day=" + day +
                ", night=" + night +
                '}';
    }
}
