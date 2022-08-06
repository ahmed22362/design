public class Animal {
	
	private String name;
	private double height;
	private int weight;
	private String favFood;
	private double speed;
	private String sound;

	public Flys flyingType; 

	
	public void setName(String newName){ name = newName; }
	public String getName(){ return name; }
	
	public void setHeight(double newHeight){ height = newHeight; }
	public double getHeight(){ return height; }
	
	public void setWeight(int newWeight){ 
		if (newWeight > 0){
			weight = newWeight; 
		} else {
			System.out.println("Weight must be bigger than 0");
		}
	}
	public double getWeight(){ return weight; }
	
	public void setFavFood(String newFavFood){ favFood = newFavFood; }
	public String getFavFood(){ return favFood; }
	
	public void setSpeed(double newSpeed){ speed = newSpeed; }
	public double getSpeed(){ return speed; }
	
	public void setSound(String newSound){ sound = newSound; }
	public String getSound(){ return sound; }
	
	// A private method can only be accessed by other public methods
	// that are in the same class
	/*
	 * you dont want to add every thing in the main or context class the
	 * if you have many algorth to do the same thing then use statgy pattern 
	 * by making an interface haveing the target method 
	 * and make a class for evey algorthm and implent it 
	 *
	 *	Bad code
	 	public void fly(){
			System.out.println("I can fly");
		}
	 *  
	 */	

	public String tryToFly(){
		return flyingType.fly();
	}

	public void setFlyingAbility(Flys newFlys){
		flyingType = newFlys;
	}

	
}