package geekbrains.homework2.lesson01.participants;

public class Robot implements Participant {

    private final String name;

    public String getName() {
        return name;
    }

    public Robot(String name) {
        this.name = name;
    }

    public int run() {
        return 10000;
    }
    public int jump() {
        return 3;
    }
}
