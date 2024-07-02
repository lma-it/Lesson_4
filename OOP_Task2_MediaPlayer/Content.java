package OOP_Task2_MediaPlayer;

public abstract class Content {
    private String name;

    public Content(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

    public String getName() {
        return name;
    }
}
