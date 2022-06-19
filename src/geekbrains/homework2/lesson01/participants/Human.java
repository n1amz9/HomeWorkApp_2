package geekbrains.homework2.lesson01.participants;

public class Human implements Participant {

    private final String name;

    public String getName() {
        return name;
    }

    public Human(String name) {
        this.name = name;
    }

    public int run() {
        return 1000;
    }
    public int jump() {
        return 2;
    }
}
