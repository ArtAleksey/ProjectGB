package ru.JavaCoreLesson;

public class MainForJavaCoreLessonOne {
    public static void main(String[] args) {
        Obstacle [] obstacles = {
                new Wall(3),
                new Treadmill(100),
                new Wall(5),
                new Wall(10),
                new Treadmill(150),
                new Treadmill(200)
        };

        Participant[] participants = {
                new Human(155,7),
                new Human(133,4),
                new Robot(150,11),
                new Robot(10,1),
                new Cat(250,15),
                new Cat(130,7),
        };

        for (Participant participant: participants) {
            for (Obstacle obstacle: obstacles) {
                if (!participant.status()) {
                    participant.overcomeObstacle(obstacle);
                }
            }
            System.out.println();
        }
    }

}
