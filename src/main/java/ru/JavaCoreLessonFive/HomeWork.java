package ru.JavaCoreLessonFive;

import java.io.*;

public class HomeWork {
    public static final String PATH = "src/ru/JavaCoreLessonFive/demo.csv";

    public static void main(String[] args) {
        String [] headers = {"Value1", "Value2", "Value3"};
        int[][] data = {
                {100, 200, 123},
                {300, 400, 500}
        };
        AppData appData = new AppData(headers, data);

        appData.writeToFile(PATH);
        System.out.println(appData);

       appData.writeToFile(PATH);
        AppData receivedAppData = AppData.readFromFile(PATH);
        System.out.println(receivedAppData);


    }
}
