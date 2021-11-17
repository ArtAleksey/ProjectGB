package ru.JavaCoreLessonFour;

public class MainForPhoneBook {
    public static void main(String[] args) {
        PhoneBook.add("Alex", "+7 902 147 12 41", "+7 963 236 23 23");
        PhoneBook.add("Alex", "+9 621 241 212");
        PhoneBook.add("Mike", "+63 21 45 78 88");

        PhoneBook.get("Alex");
        PhoneBook.get("Mike");
    }
}
