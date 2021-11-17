package ru.JavaCoreLessonFour;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class WithWords {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Mike");
        arrayList.add("Dima");
        arrayList.add("Frank");
        arrayList.add("Kira");
        arrayList.add("Ignat");
        arrayList.add("Frank");
        arrayList.add("Alex");
        arrayList.add("Nina");
        arrayList.add("Kira");
        arrayList.add("Kira");
        arrayList.add("Jax");
        arrayList.add("Anna");
        arrayList.add("Dima");
        arrayList.add("lina");
        arrayList.add("Pasha");
        arrayList.add("Nina");
        arrayList.add("Mike");

        System.out.println(arrayList);

        listWithoutRepeats(arrayList);
        countOfRepeats(arrayList);


//        LinkedHashSet<String> hashSet = new LinkedHashSet<>();
//        hashSet.addAll(arrayList);
//
//        System.out.println(hashSet);
//
//        ArrayList<String> newArrayListUnique = new ArrayList();
//        newArrayListUnique.addAll(hashSet);
//
//        for (int i = 0; i < newArrayListUnique.size(); i++) {
//            String element = newArrayListUnique.get(i);
//            int repeat = 0;
//            for (int j = 0; j < arrayList.size(); j++) {
//                if (element.equals(arrayList.get(j))){
//                    repeat++;
//                }
//            }
//            System.out.println(element + " meets at ArrayList " + repeat + " times.");
//        }
    }

    public static void listWithoutRepeats(ArrayList<String> inputArrayList) {
        LinkedHashSet<String> hashSet = new LinkedHashSet<>();
        hashSet.addAll(inputArrayList);

        System.out.println(hashSet);
    }

    public static void countOfRepeats(ArrayList<String> countElementRepeat) {
        LinkedHashSet<String> hashSetUnique = new LinkedHashSet<>();
        hashSetUnique.addAll(countElementRepeat);
        ArrayList<String> newArrayListUnique = new ArrayList<>();
        newArrayListUnique.addAll(hashSetUnique);

        for (int i = 0; i < newArrayListUnique.size(); i++) {
            String element = newArrayListUnique.get(i);
            int repeat = 0;
            for (int j = 0; j < countElementRepeat.size(); j++) {
                if (element.equals(countElementRepeat.get(j))){
                    repeat++;
                }
            }
            System.out.println(element + " meets at ArrayList " + repeat + " times.");
        }

    }
}
