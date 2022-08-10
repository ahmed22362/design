package chain_of_responsibility;

public class MultNumbers implements Chain{

	private  Chain nextInChain;
	
	@Override
	public void setNextChain(Chain nextChain) {
		
		nextInChain = nextChain;
		
	}

	@Override
	public void calculate(Numbers request) {
		
		if(request.getCalculationWanted() == "mult"){
			
			System.out.print(request.getNumber1() + " * " + request.getNumber2() + " = "+
					(request.getNumber1()*request.getNumber2()));
			
		} else {
			
			nextInChain.calculate(request);
			
		}
		
	}

	
	
}