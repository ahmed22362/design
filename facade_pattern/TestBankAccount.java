package facade_pattern;

public class TestBankAccount {
    public static void main(String[] args) {
        BannkAccountFacade accessingBank = new BannkAccountFacade(1344525,1234); 
        accessingBank.withdrawCash(50.00);
		
		accessingBank.withdrawCash(990.00);
    }
}
