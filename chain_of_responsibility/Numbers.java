package chain_of_responsibility;

public class Numbers {

    private int num1;
    private int num2;

    private String calcWanted;

    public Numbers(int num1 , int num2 , String calcWanted){
        this.num1 = num1;
        this.num2 = num2;
        this.calcWanted = calcWanted;
    }

    public int getNumber1(){return num1;}
    public int getNumber2(){return num2;}
    public String getCalculationWanted(){return calcWanted;}
}
