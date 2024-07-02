package OOP_Task3_OlympicGames;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Team<T extends Programmer> {
    private String name;
    private List<T> programmers;
    
    public Team(String name) {
        this.name = name;
        programmers = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void add(T p){
        programmers.add(p);
    }

    @Override
    public String toString() {
        return String.format("Team: %s Members: %s", name, programmers);
    }
}
