package OOP_Task3_OlympicGames;

import java.util.Random;

public class Olympiad<T extends Programmer> {
    Team<T> team1, team2;
    Random rand = new Random();

    public Olympiad(Team<T> team1, Team<T> team2) {
        this.team1 = team1;
        this.team2 = team2;
    }

    public void start(){
        String winner = rand.nextInt(2) == 0 ? team1.getName() : team2.getName();
        System.out.println(String.format("Winner: %s", winner));
    }
}
