package ru.JavaCoreLessonSix.entity;

public class WeatherForecast {

    private final String city;
    private final String date;
    private final String dayTextForecast;
    private final String nightTextForecast;
    private final Double temperatureMin;
    private final Double temperatureMax;

    public WeatherForecast(String city, String date, String dayTextForecast, String nightTextForecast, Double temperatureMin, Double temperatureMax) {
        this.city = city;
        this.date = date;
        this.dayTextForecast = dayTextForecast;
        this.nightTextForecast = nightTextForecast;
        this.temperatureMin = temperatureMin;
        this.temperatureMax = temperatureMax;
    }

    @Override
    public String toString() {
        return "WeatherForecast{" +
                "city='" + city + '\'' +
                ", date='" + date + '\'' +
                ", dayTextForecast='" + dayTextForecast + '\'' +
                ", nightTextForecast='" + nightTextForecast + '\'' +
                ", temperatureMin=" + temperatureMin +
                ", temperatureMax=" + temperatureMax +
                '}';
    }
}
