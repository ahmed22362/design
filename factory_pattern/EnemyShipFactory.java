package factory_pattern;

public class EnemyShipFactory {
    
	// This could be used as a static method if we
	// are willing to give up subclassing it
	
	public EnmyShip makeEnemyShip(String newShipType){
		
		EnmyShip newShip = null;
		
		if (newShipType.equals("U")){
			
			return new UFOEnmyShig();
			
		} else 
		
		if (newShipType.equals("R")){
			
			return new RocketEnmyShip();
			
		} else 
		
		if (newShipType.equals("B")){
			
			return new BigUFOEnemyShip();
			
		} else return null;
		
	}
}
