package facade_pattern;

public class FundsCheck {
    private double cashInAccount = 1000.00;;

    public double getCachInAccount(){
        return cashInAccount;
    }
    public void decreaseCashInAccount(double cashWithdrawn){
        cashInAccount -= cashWithdrawn;
    }
    public void increaseCashInAccount(double cashDeposited){
        cashInAccount += cashDeposited;
    }

    public boolean haveEnoughMoney(double CashToWithdrawal){
        if(CashToWithdrawal>getCachInAccount()){
            System.out.println("you don't have enough money");
            System.out.println("Current Balance: "+ getCachInAccount());
            return false;
        }else{
            decreaseCashInAccount(CashToWithdrawal);
            System.out.println("Withdrawal complete: current balancs is: "+getCachInAccount());
            return true;
        }
    }


    public void makeDeposite(double cashToDeposit){
        increaseCashInAccount(cashToDeposit);
        System.out.println("your task completed succesufly your current balance is: " + getCachInAccount());
    }
}
