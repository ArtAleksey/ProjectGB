package ru.HomeworkSeven;

public class MainClass {
    public static void main(String[] args) {
        Cat[] cat = {
                new Cat("Barsik", 5),
                new Cat("Vova", 15),
                new Cat("Jac", 35)
        };
        Plate plate = new Plate(21);
        plate.info();
        System.out.println("------------------");

        doCatEat(cat,plate);
        doCatInfo(cat);

        plate.info();

        plate.increaseFood(12);
        plate.info();
    }

    public static void doCatEat(Cat[] cats, Plate plate) {
        for (int i = 0; i < cats.length; i++) {
            cats[i].eat(plate);
        }
    }

    public static void doCatInfo(Cat[] cat) {
        for (int i = 0; i < cat.length; i++) {
            cat[i].catInfo();
            System.out.println("------------------");
        }
    }

}
