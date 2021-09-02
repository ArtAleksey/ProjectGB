package ru.JavaCoreLessonSix.repository;

import ru.JavaCoreLessonSix.entity.WeatherForecast;

import java.sql.*;

public class WetherForecastRepo {

    private Statement statement;
    private PreparedStatement preparedStatement;

    public WetherForecastRepo() throws ClassNotFoundException {
        Class.forName("org.sqlite.JDBC");
    }

    public void save(String city, String date, String dayTextForecast, String nightTextForecast, double temperatureMin, double temperatureMax) throws SQLException {
        try (Connection connection = DriverManager.getConnection("jdbc:sqlite:mydatabase.db")) {
            statement = connection.createStatement();
            statement.executeUpdate("CREATE TABLE IF NOT EXISTS weather_forecast" +
                    "(id INTEGER PRIMARY KEY AUTOINCREMENT," +
                    "city String," +
                    "date String," +
                    "dayTextForecast String," +
                    "nightTextForecast String," +
                    "temperatureMin Real," +
                    "temperatureMax Real);"
            );

            preparedStatement = connection.prepareStatement(
                    "INSERT INTO weather_forecast" +
                            "(city, date, dayTextForecast, nightTextForecast, temperatureMin, temperatureMax)" +
                            "VALUES(?,?,?,?,?,?)"
            );

            preparedStatement.setString(1, city);
            preparedStatement.setString(2, date);
            preparedStatement.setString(3, dayTextForecast);
            preparedStatement.setString(4, nightTextForecast);
            preparedStatement.setDouble(5, temperatureMin);
            preparedStatement.setDouble(6, temperatureMax);
            preparedStatement.execute();
        }

    }


    public void read() throws SQLException {
        try (Connection connection = DriverManager.getConnection("jdbc:sqlite:mydatabase.db")) {
            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM weather_forecast");
            while (resultSet.next()) {
                WeatherForecast weatherForecast = new WeatherForecast(
                        resultSet.getString(2),
                        resultSet.getString(3),
                        resultSet.getString(4),
                        resultSet.getString(5),
                        resultSet.getDouble(6),
                        resultSet.getDouble(7)
                );
                System.out.println(weatherForecast);
            }
        }
    }

}
