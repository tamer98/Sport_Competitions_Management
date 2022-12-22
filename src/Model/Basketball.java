package Model;

public class Basketball extends Game implements Competition {
    private int num1,num2;
    private int a3,a4;
    private int b3,b4;

    public Basketball(String name1, String name2, int a1, int a2, int a3, int a4, int b1, int b2, int b3, int b4) {
        super(name1,name2,a1,a2,b1,b2);     //calling the super constructor
        this.a3 = a3;
        this.a4 = a4;
        this.b3 = b3;
        this.b4 = b4;
        Result();       // calling the result method
    }

    @Override
    public void Result() {
        num1 = a1 + a2 + a3 + a4;  //calculating the result
        num2 = b1 + b2 + b3 + b4;
        if(num1 > num2){        // setting the value of result
            super.winner = name1;
        }
        else{
            super.winner = name2;
        }
    }

    @Override
    public String Winner() {
        return winner;
    }
}
