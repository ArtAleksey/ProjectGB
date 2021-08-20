package ru.JavaCoreLessonThree;

import java.util.ArrayList;
import java.util.Objects;

public class Box <T extends  Fruit>{

    private ArrayList<T> fruits = new ArrayList<>();

    public Box() {
    }

    public Box(ArrayList<T> fruits) {
        this.fruits = fruits;
    }

    public Float getWeight() {
        float result = 0.0f;

        if (this.fruits.isEmpty()) {
            return result;
        }
        return result = fruits.size() * fruits.get(0).weight;
    }

    public Boolean compare(Box<? extends Fruit> otherBox) {
        return  (otherBox.getWeight().equals(this.getWeight()));
    }

    public void addFruits (ArrayList<T> newFruits) {
        fruits.addAll(newFruits);
    }

    public void goToAnotherBox(Box<T> toThisBox) {
        if (this.fruits != null) {
            toThisBox.addFruits(this.fruits);
            this.fruits.clear();
        }

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Box<?> box = (Box<?>) o;
        return Objects.equals(fruits, box.fruits);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fruits);
    }

    @Override
    public String toString() {
        return "Box{" +
                "fruits=" + fruits +
                '}';
    }
}
