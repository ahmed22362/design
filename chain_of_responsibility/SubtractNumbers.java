package chain_of_responsibility;

public class SubtractNumbers implements Chain{

    private Chain nextInChain;

    @Override
    public void setNextChain(Chain nextChain) {
        this.nextInChain = nextChain;
        
    }

    @Override
    public void calculate(Numbers reques) {
      if(reques.getCalculationWanted() =="sub"){
        System.out.println(reques.getNumber1() + "-"+reques.getNumber2() +"=" 
        + (reques.getNumber1() - reques.getNumber2()));
      }else{
        nextInChain.calculate(reques);
      }
        
    }
    
}
