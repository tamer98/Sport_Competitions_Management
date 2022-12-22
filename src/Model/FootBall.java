package Model;

public class FootBall extends Game implements Competition {
    private int num1,num2;

    public FootBall(String name1, String name2, int a1, int a2, int b1, int b2) {
        super(name1,name2,a1,a2,b1,b2);     // calling the constructor
        Result();   // calling the result method
    }

    @Override
    public void Result() {
        num1 = a1 + a2; // adding the score
        num2 = b1 + b2;
        if(num1 > num2){
            super.winner = name1;
        }
        else if (num2 > num1){
            super.winner = name2;
        } else if (num2 == num1){
                super.winner = "none";
        }

    }

    @Override
    public String Winner() {
        return winner;
    }
}
