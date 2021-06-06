package ru.NewHomework;

public abstract class Animal {

    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public abstract void doSwim (int lengthToSwim);

    public abstract void doRun (int lengthToRun);

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
