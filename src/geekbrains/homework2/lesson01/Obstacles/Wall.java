package geekbrains.homework2.lesson01.Obstacles;

import geekbrains.homework2.lesson01.participants.Participant;

import java.util.Objects;

public class Wall implements Obstacles{
    private final int height;

    public Wall(int height){
        this.height = height;
    }

    public boolean passObstacle(Participant participant) {
        if (participant.jump() <= height) {
            System.out.printf("Участник %s успешно перепрыгнул через стену высотой %d %n", Objects.toString(participant.getName()), height);
            return true;
        } else {
            System.out.printf("Участник %s НЕ перепрыгнул через стену высотой %d %n", Objects.toString(participant.getName()), height);
            return false;
        }
    }
}
