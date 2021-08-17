package ru.JavaCoreLesson;

public class Treadmill implements Obstacle{
    public final int length;

    public Treadmill(int length) {
        this.length = length;
    }

    @Override
    public String toString () {
        return String.format("Treadmill with length = %d", length);
    }
}
