package facade_pattern;

public class BannkAccountFacade {
    private int accountNumber;
    private int securityCode;

    AccountNumberCheck accChecker;
    SecurityCodeCheck codeChecker;
    FundsCheck funChecker;
    WelcomToBank welcomMessage;

    public BannkAccountFacade(int accountNumber, int securityCode){
        this.accountNumber = accountNumber;
        this.securityCode = securityCode;
        
        welcomMessage = new WelcomToBank();
        accChecker = new AccountNumberCheck();
        codeChecker = new SecurityCodeCheck();
        funChecker = new FundsCheck();
    }


    public int getAccountNumber(){return accountNumber;}
    public int getSecurityCode(){return securityCode;}


    public void withdrawCash(double cashToGet){
		
		if(accChecker.accountActive(getAccountNumber()) &&
				codeChecker.isCodeCorrect(getSecurityCode()) &&
				funChecker.haveEnoughMoney(cashToGet)) {
					
					System.out.println("Transaction Complete\n");
					
				} else {
					
					System.out.println("Transaction Failed\n");
					
				}
	}
	
	public void depositCash(double cashToDeposit){
		
		if(accChecker.accountActive(getAccountNumber()) &&
				codeChecker.isCodeCorrect(getSecurityCode())) {
			
					funChecker.makeDeposite(cashToDeposit);
					
					System.out.println("Transaction Complete\n");
					
				} else {
					
					System.out.println("Transaction Failed\n");
					
				}
		
	}
	
}
