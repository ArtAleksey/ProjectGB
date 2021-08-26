package ru.JavaCoreLessonThree;

public class MainForSwapper {
    public static void main(String[] args) {

        String[] arrayString = {"Alex", "Bella", "Mike", "Nikola", "Rob"};
        SwapArrayElements<String> swpStringArray = new SwapArrayElements<>();
        swpStringArray.swap(arrayString,2,4);
        for (String i : arrayString) {
            System.out.print(i + " ");
        }
        System.out.println();

        Float[] arrayFloat = {1.2f, 2.5f, 3.4f, 2.3f, 6.1f};
        SwapArrayElements<Float> swpFloatArray = new SwapArrayElements<>();
        swpFloatArray.swap(arrayFloat,2,4);
        for (Float i : arrayFloat) {
            System.out.print(i + " ");
        }

    }
}
