package ru.JavaCoreLesson;

public class Human implements Participant {
    private final int length;
    private final int height;
    public boolean lost;


    public Human(int length, int height) {
        this.length = length;
        this.height = height;
    }

    @Override
    public boolean status (){
        return this.lost;
    }

    @Override
    public void run (Treadmill treadmill) {
        if (length >= treadmill.length) {
            System.out.printf("Human overcome treadmill: %s !!!\n", treadmill);
        } else {
            System.out.printf("Human can't overcome treadmill: %s !!!\n", treadmill);
            this.lost = true;
        }
    }

    @Override
    public void jump (Wall wall) {
        if (height >= wall.height) {
            System.out.printf("Human overcome wall: %s !!!\n", wall);
        } else {
            System.out.printf("Human can't overcome wall: %s !!!\n", wall);
            this.lost = true;
        }
    }
}
