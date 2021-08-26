package ru.NewHomework;

public class Cat extends Animal {

    public Cat(String name) {
        super(name);
    }

    @Override
    public void doSwim(int lengthToSwim) {
        if (lengthToSwim == 0) {
            System.out.printf("Хорошо что вы не заставили %s плыть.%n", getName());
        } else {
            System.out.printf("%s столько не проплывет!!!%n", getName());
        }
    }

    @Override
    public void doRun(int lengthToRun) {
        if (lengthToRun <= 300) {
            System.out.printf("%s пробежал(-а) %sм%n", getName(), lengthToRun);
        } else {
            System.out.printf("%s столько не пробежит!!!%n", getName());
        }
    }
}
