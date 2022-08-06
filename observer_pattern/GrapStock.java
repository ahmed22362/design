package observer_pattern;

public class GrapStock {
    public static void main(String[] args) {
        StockGrapper stockGrapper = new StockGrapper();

        StockObserver observer1 = new StockObserver(stockGrapper);

        stockGrapper.setAAPPrice(8429);
        stockGrapper.setGOOGPrice(452);
        stockGrapper.setIBMPrice(868);

    }
}
