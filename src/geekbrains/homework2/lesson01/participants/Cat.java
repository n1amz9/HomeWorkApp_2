package geekbrains.homework2.lesson01.participants;

public class Cat implements Participant {

    private final String name;

    public Cat(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int run() {
        return 100;
    }
    public int jump() {
        return 2;
    }

}

