package OOP_Task3_OlympicGames;
import static print_module.print_library.println;

// import java.util.Random;

public class OlympicGameMain {
    public static void main(String[] args) {
        println("Начало Международной Олимпиады по программированию 2024.");

        // Random rand = new Random();
        Team<Interns> team1 = new Team<>("Beat_Code");
        team1.add(CrewMaker.CreateInterns());
        team1.add(CrewMaker.CreateInterns());
        println(team1);

        Team<Interns> team2 = new Team<>("Coders");
        team2.add(CrewMaker.CreateInterns());
        team2.add(CrewMaker.CreateInterns());
        // team2.add(CrewMaker.CreateMiddles());
        println(team2);

        var o = new Olympiad<Interns>(team1, team2);
        o.start();
    }
}
