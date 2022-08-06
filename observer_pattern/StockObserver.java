package observer_pattern;


public class StockObserver implements Observer{

    private double IBMPrice;
    private double AAPPrice;
    private double GooGPrice;

    private static int observerIDTracker =0;
    private int observerID;


    private Subject sg;

    public StockObserver(StockGrapper stockGrapper){
        this.sg = stockGrapper;

        this.observerID = ++observerIDTracker;

        System.out.println("New Observer " + this.observerID);

        sg.register(this);


    }


    @Override
    public void update(double ibmPrice, double googlePrice, double aaapPrice) {
        this.AAPPrice = aaapPrice;
        this.GooGPrice = googlePrice;
        this.IBMPrice = ibmPrice;
        printPrices();
    }


    private void printPrices() {

        System.out.println(observerID + "\nIBM: " + IBMPrice + "\nAAPL: " +
                        AAPPrice + "\nGOOG: " + GooGPrice + "\n");
    }
    
}
