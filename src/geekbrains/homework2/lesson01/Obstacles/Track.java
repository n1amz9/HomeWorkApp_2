package geekbrains.homework2.lesson01.Obstacles;

import geekbrains.homework2.lesson01.participants.Participant;

import java.util.Objects;

public class Track implements Obstacles {

    private final int length;

    public Track(int length) {
        this.length = length;
    }

    public boolean passObstacle(Participant participant) {
        if (participant.jump() <= length) {
            System.out.printf("Участник %s успешно пробежал дорожку длиной %d %n", Objects.toString(participant.getName()), length);
            return true;
        } else {
            System.out.printf("Участник %s НЕ пробежал дорожку длиной высотой %d %n", Objects.toString(participant.getName()), length);
            return false;
        }

    }
}
