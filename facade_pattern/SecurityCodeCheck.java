package facade_pattern;

public class SecurityCodeCheck{

    private int SecurityCode = 1234;

    public int getSecCode(){
        return SecurityCode;
    }
    public boolean isCodeCorrect(int secCodeToCheck){
        return secCodeToCheck == getSecCode();
    }

}