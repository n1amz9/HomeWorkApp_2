package geekbrains.homework2.lesson01;

import geekbrains.homework2.lesson01.Obstacles.Obstacles;
import geekbrains.homework2.lesson01.Obstacles.Track;
import geekbrains.homework2.lesson01.Obstacles.Wall;
import geekbrains.homework2.lesson01.participants.Cat;
import geekbrains.homework2.lesson01.participants.Human;
import geekbrains.homework2.lesson01.participants.Participant;
import geekbrains.homework2.lesson01.participants.Robot;

import java.util.Arrays;
import java.util.Objects;

public class homeworkMain_1 {
    public static void main(String[] args) {

        Cat cat = new Cat("Барсик");
        Robot robot = new Robot("C3P0");
        Human human = new Human("Владимир");

        Track track = new Track(1300);
        Wall wall = new Wall(2);

        Participant[] participants = {cat, robot, human};
        Obstacles[] obstacles = {track,wall};

        for (Participant participant : participants) {
            for (Obstacles obstacle : obstacles) {
                if (!obstacle.passObstacle(participant)) {
                    System.out.printf("Участник %s ВЫБЫВАЕТ из соревнований %n", Objects.toString(participant.getName()));
                    break;
                }
            }
        }
    }
}
