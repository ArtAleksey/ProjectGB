package ru.HomeworkSeven;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public void decreaseFood(int n) {
        if (food >= n) {
            food -= n;
        } else {
            System.out.println("Cat too hungry for this plate!");
        }
    }
    public void info() {
        System.out.println("plate: " + food);
    }

    public void increaseFood(int value) {
        food += value;
    }

    public int getFood() {
        return food;
    }
}
