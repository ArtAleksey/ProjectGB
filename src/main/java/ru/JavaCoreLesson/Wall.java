package ru.JavaCoreLesson;

public class Wall implements Obstacle{
    public final int height;

    public Wall(int height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return String.format("Wall with height = %d", height);
    }
}
