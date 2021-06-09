package ru.NewHomework;

public class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void doSwim(int lengthToSwim) {
        if (lengthToSwim <= 10) {
            System.out.printf("%s проплыл(-а) %sм%n", getName(), lengthToSwim);
        } else {
            System.out.println("Собаки столько не плавают!!!");
        }
    }

    @Override
    public void doRun(int lengthToRun) {
        if (lengthToRun <= 500) {
            System.out.printf("%s пробежал(-а) %sм%n", getName(), lengthToRun);
        } else {
            System.out.println("Собаки столько не бегают!!!");
        }
    }
}
