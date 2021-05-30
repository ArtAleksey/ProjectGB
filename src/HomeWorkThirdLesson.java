import java.util.Random;

public class HomeWorkThirdLesson {
    public static void main(String[] args) {
        doTaskOne(10);
        doTaskTwo();
        doTaskThree();
        doTaskFour(10);
        doTaskFive(5, 3);
        doTaskSix(100);
        System.out.println(doTaskSeven(new int[]{2, 2, 2, 1, 2, 2, 10, 1}));

    }

    public static void doTaskOne(int volume) {
        int [] array = new int[volume];

        System.out.println("Исходный массив:");
        for (int i = 0; i < array.length; i++) {
            array [i] = (int)(Math.random()*2);
            System.out.print("[" + array[i] + "] ");
        }
        System.out.println();

        System.out.println("Новый массив:");
        for (int i = 0; i < array.length; i++) {
            if (array [i] == 0) {
                array[i] = 1;
            } else {
                array[i] = 0;
            }
            System.out.print("[" + array[i] + "] ");
        }
        System.out.println();
    }

    public static void doTaskTwo() {
        int[] array = new int[100];
        System.out.println("Массив по порядку:");
        for (int i = 0; i < array.length; i++) {
            array[i] = i+1;
            System.out.print("[" + array[i] + "] ");
        }
        System.out.println();
    }

    public static void doTaskThree() {
        int[] array = new int[] {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};

        System.out.println("Исходный массив:");
        for (int i = 0; i < array.length; i++) {
            System.out.print("[" + array[i] + "] ");
        }
        System.out.println();

        System.out.println("Измененный массив:");
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6) {
                array[i] *= 2;
            }
            System.out.print("[" + array[i] + "] ");
        }
        System.out.println();
    }

    public static void doTaskFour(int volume) {
        int[][] array = new int[volume][volume];
        System.out.println("Массив с заполнеными диагоналями:");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i == j || j == (volume - i - 1)) {
                    array[i][j] = 1;
                } else {
                    array[i][j] = 0;
                }
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void doTaskFive(int len, int initialValue) {
        int[] array = new int[len];
        System.out.println("Массив длинной " + len + " и заполненный  числом " + initialValue);
        for (int i = 0; i < array.length; i++) {
            array[i] = initialValue;
            System.out.print("[" + array[i] + "] ");
        }
        System.out.println();
    }

    public static void doTaskSix(int volume) {
        int[] array = new int[volume];
        System.out.println("Иассив в котором будем искать минимальное и максимальное значение: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random() * volume);
            System.out.print("[" + array[i] + "] ");
        }
        System.out.println();

        int max = array[0];
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("Наибольшее число в массиве: " + max);
        System.out.println("Наименьшее число в массиве: " + min);

    }

    public static boolean doTaskSeven(int array[]) {
        int left = 0;
        int right = 0;
        int logic = 0;

        System.out.println("Иассив в котором будем искать равенство сумм двух частей: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print("[" + array[i] + "] ");
            right += array[i];
        }

        for (int i = 0; i < array.length; i++) {
            left += array[i];
            right -= array[i];
            if (left == right) {
                logic++;
                break;
            }
        }

        if (logic > 0) {
            return true;
        }
        return false;
    }


}
