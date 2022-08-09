package facade_pattern;

public class AccountNumberCheck {
    private int accoutnNumber  = 1344525;

    public int getAccountNumber(){
        return accoutnNumber;
    }
    public boolean accountActive(int accNumToCheck){
        return accNumToCheck == getAccountNumber();

    }
}
