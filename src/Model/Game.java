package Model;

public abstract class Game {
    static String winner;
    String name1,name2;
    int a1,a2,b1,b2;
    public Game(String name1, String name2, int a1, int a2, int b1, int b2) {
        this.name1 = name1;     // initializing the values
        this.name2 = name2;
        this.a1 = a1;
        this.a2 = a2;
        this.b1 = b1;
        this.b2 = b2;
    }

    public static String getWinner() {
        return winner;
    }
}
