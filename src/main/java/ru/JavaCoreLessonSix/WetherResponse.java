package ru.JavaCoreLessonSix;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import ru.JavaCoreLessonSix.dto.DailyForecasts;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class WetherResponse {
    @JsonProperty("DailyForecasts")
    private List<DailyForecasts> dailyForecasts;

    public WetherResponse() {
    }

    public WetherResponse(List<DailyForecasts> dailyForecasts) {
        this.dailyForecasts = dailyForecasts;
    }

    public List<DailyForecasts> getDailyForecasts() {
        return dailyForecasts;
    }

    public void setDailyForecasts(List<DailyForecasts> dailyForecasts) {
        this.dailyForecasts = dailyForecasts;
    }

    @Override
    public String toString() {
        return "WetherResponse{" +
                "dailyForecasts=" + dailyForecasts +
                '}';
    }
}
