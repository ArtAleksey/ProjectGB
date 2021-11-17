package ru.JavaCoreLessonFour;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneBook {
    private static final Map<String, List<String>> phoneBook = new HashMap<>();

    public static void add(String name, String... phones) {
        if (phoneBook.get(name) != null) {
            List<String> arrayOfPhones = new ArrayList<>(phoneBook.get(name));
            arrayOfPhones.addAll(List.of(phones));
            phoneBook.put(name, arrayOfPhones);
        } else {
            phoneBook.put(name, List.of(phones));
        }
    }

    public static void get(String name) {
        System.out.printf("Phone number fo %s: %s\n", name, phoneBook.get(name));
    }
}
