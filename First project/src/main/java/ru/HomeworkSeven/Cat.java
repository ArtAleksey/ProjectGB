package ru.HomeworkSeven;

public class Cat {
    private String name;
    private int appetite;
    private boolean satiety = false;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    public void eat(Plate plate) {
        if (appetite <= plate.getFood()) {
            plate.decreaseFood(appetite);
            satiety = true;
        } else  {
            System.out.println("Not enough food for " + name + "!!");
        }
    }

    public void catInfo() {
        System.out.println("Cat name: " + name);
        System.out.println("Satiety: " + satiety);
    }
}
