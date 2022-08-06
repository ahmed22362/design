package observer_pattern;

import java.util.ArrayList;

public class StockGrapper implements Subject{

    private ArrayList<Observer>observers; 
    private double ibmPrice;
    private double aaplPrice;
    private double googPrice;
    

    public StockGrapper(){
        observers = new ArrayList<Observer>();
    }

    @Override
    public void register(Observer newObserver) {
        observers.add(newObserver);
        
    }


    @Override
    public void unregister(Observer deletedObserver) {
        int index = observers.indexOf(deletedObserver);
        observers.remove(index);
        System.out.println("observer "+(index +1) +"deleted");
    }

    @Override
    public void notifyObserver() {
        for(Observer o :observers){
            o.update(ibmPrice, googPrice, aaplPrice);
        }
        
    }

    public void setIBMPrice(double price){
        ibmPrice = price;
        notifyObserver();
    }
    public void setAAPPrice(double price){
        aaplPrice = price;
        notifyObserver();
    }
    public void setGOOGPrice(double price){
        googPrice = price;
        notifyObserver();
    }
    
}
