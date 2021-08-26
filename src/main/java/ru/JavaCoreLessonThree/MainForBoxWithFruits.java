package ru.JavaCoreLessonThree;

import java.util.ArrayList;
import java.util.Arrays;

public class MainForBoxWithFruits {
    public static void main(String[] args) {
        Box<Apple> appleBox = new Box<>(new ArrayList<>(Arrays.asList(new Apple(), new Apple(), new Apple(), new Apple())));
        Box<Apple> appleBox2 = new Box<>(new ArrayList<>(Arrays.asList(new Apple(), new Apple(), new Apple(), new Apple())));
        Box<Orange> orangeBox = new Box<>(new ArrayList<>(Arrays.asList(new Orange(),new Orange(), new Orange(), new Orange(), new Orange())));
        Box<Orange> orangeBox2 = new Box<>(new ArrayList<>(Arrays.asList(new Orange(), new Orange())));

        System.out.println(appleBox.getWeight());
        System.out.println(orangeBox.getWeight());
        System.out.println(appleBox.compare(orangeBox));
        orangeBox2.goToAnotherBox(orangeBox);
        System.out.println(orangeBox);
        System.out.println(orangeBox2);
    }
}
