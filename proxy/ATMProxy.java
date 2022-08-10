package proxy;

public class ATMProxy implements GetATMData{

    @Override
    public ATMState getATMData() {
        ATMMachine roolAtmMachine = new ATMMachine();
        return roolAtmMachine.getATMData();
    }

    @Override
    public int getCashInMachine() {
        ATMMachine roolAtmMachine = new ATMMachine();
        return roolAtmMachine.getCashInMachine();
    }
    
}
