package OOP_Task3_OlympicGames;

public class CrewMaker {

    // public static Programmer CreateCrew(int i){
    //     switch (i) {
    //         case 0:
    //             return new Interns();
    //         case 1:
    //             return new Middles();
    //         default:
    //             return new Principals();
    //     }
    // }

    public static Interns CreateInterns(){
        return new Interns();
    }

    public static Middles CreateMiddles(){
        return new Middles();
    }

    public static Principals CreatePrincipals(){
        return new Principals();
    }


}
