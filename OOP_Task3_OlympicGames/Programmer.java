package OOP_Task3_OlympicGames;

import java.util.Random;
// import java.util.UUID;

public abstract class Programmer {
    private String fullName;
    private int age;
    NameCreater nc = new NameCreater();

    public Programmer() {
        Random rand = new Random();
        //String tName = UUID.randomUUID().toString().substring(0,10);
        int tAge = rand.nextInt(18, 55);
        this.fullName = nc.names.get(rand.nextInt(nc.names.size()));
        this.age = tAge;
    }

    public int getAge() {
        return age;
    }

    public String getFullName() {
        return fullName;
    }
}
