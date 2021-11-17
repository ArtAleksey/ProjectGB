package ru.JavaCoreLesson;

public interface Participant {
    default void overcomeObstacle (Obstacle obstacle) {
        if (obstacle instanceof Wall) {
            Wall wall = (Wall) obstacle;
            this.jump(wall);
        } else if (obstacle instanceof Treadmill) {
            Treadmill treadmill = (Treadmill) obstacle;
            this.run(treadmill);
        }
    }

    boolean status();
    void run (Treadmill treadmill);
    void jump (Wall wall);

}
