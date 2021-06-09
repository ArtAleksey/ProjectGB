package ru.HomeworkSeven;

public class MainClass {
    public static void main(String[] args) {
        Cat[] cat = {
            new Cat("Barsik", 105),
            new Cat("Vova", 89),
            new Cat("Jac", 184)
        };
        Plate plate = new Plate(205);
        plate.info();

        doCatEat(cat,plate);

        doCatInfo(cat);

        plate.info();

        plate.increaseFood(100);
        plate.info();
    }

    public static void doCatEat(Cat[] cats, Plate plate) {
        for (int i = 0; i < cats.length; i++) {
            cats[i].eat(plate);
            System.out.println("------------------");
        }
    }

    public static void doCatInfo(Cat[] cats) {
        for (int i = 0; i < cats.length; i++) {
            cats[i].catInfo();
            System.out.println("-------------------");
        }
    }

}
