package Model;

public class Tennis extends Game implements Competition {

    private int num1,num2;
    private int a3,a4,a5;
    private int b3,b4,b5;

    public Tennis(String name1, String name2, int a1, int a2, int a3, int a4, int a5, int b1, int b2, int b3, int b4, int b5) {
        super(name1,name2,a1,a2,b1,b2);     // constructor
        this.a3 = a3;
        this.a4 = a4;
        this.a5 = a5;
        this.b3 = b3;
        this.b4 = b4;
        this.b5 = b5;
        Result();       //result method
    }

    @Override
    public void Result() {
        if(a1 > b1){    // calculating the result
            num1++;
        }else {
            num2++;
        }
        if(a2 > b2){
            num1++;
        }else {
            num2++;
        }
        if(a3 > b3){
            num1++;
        }else {
            num2++;
        }
        if(a4 > b4){
            num1++;
        }else {
            num2++;
        }
        if(a5 > b5){
            num1++;
        }else {
            num2++;
        }
        if(num1 > num2){        // setting the winner
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
