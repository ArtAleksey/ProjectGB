package ru.JavaCoreLessonTwo;

public class HomeWorkForJavaCore {
    public static void main(String[] args) {

        String[][] first = {
                {"10", "20", "30", "40"},
                {"11", "21", "31", "41"},
                {"12", "22", "32", "42"},
                {"13", "23", "33", "43"}

        };

        try {
            System.out.println("Sum of all numbers of array: " + sumArray(first));
        } catch (MyArraySizeException e) {
            System.out.println("Wrong array size. It should be 4x4 !!!");
        } catch (MyArrayDataException e) {
            System.out.printf("Element %dx%d is not a number!!!", e.i, e.j);
        }



    }

    public static int sumArray (String[][] arr) throws MyArraySizeException, MyArrayDataException {
        int sum = 0;
        if (arr.length != 4) {
            throw new MyArraySizeException("This array is not 4x4!!!");
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                try {
                    sum += Integer.parseInt(arr[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(i, j, " this element is not a number!!!");
                }
            }
        }
        return sum;
    }
}
