package chain_of_responsibility;

public interface Chain {
    public void setNextChain(Chain nextChain);
    public void calculate(Numbers reques);
}
