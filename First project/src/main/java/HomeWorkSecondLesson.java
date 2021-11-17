public class HomeWorkSecondLesson {
    public static void main(String[] args) {
        System.out.println(doTaskOne(6,15));
        doTaskTwo(0);
        System.out.println(doTaskThree(-5));
        doTaskFour("Надеюсь я все правильно делаю!", 5);
        System.out.println(doTaskFive(1100));

    }

     static boolean doTaskOne (int firstNumber, int secondNumber) {
        if ((firstNumber + secondNumber >= 10) && (firstNumber + secondNumber <= 20)) {
            return true;
        } else {
            return false;
        }
    }

    static void doTaskTwo (int number) {
        if (number >= 0) {
            System.out.println("Число " + number + " положительное!");
        } else {
            System.out.println("Число " + number + " отрицательное!");
        }
    }

    static boolean doTaskThree (int number) {
        if (number >= 0) {
            return false;
        } else {
            return true;
        }
    }

    static void doTaskFour (String line, int count) {
        for (int i = 0; i < count; i++) {
            System.out.println(line);
        }
    }

    static boolean doTaskFive (int year) {
        if (year % 400 == 0) {
            return true;
        } else if ((year % 4 == 0) && (year % 100 != 0)) {
            return true;
        } else {
            return false;
        }
    }

}
