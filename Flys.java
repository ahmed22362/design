//interface for stategy pattern by make class for every algorthm
interface Flys {
    String fly();
}


class CanFly implements Flys{
    public String fly() {
        return "Flying high";
    } 
}

class CanNotFly implements Flys{

	public String fly() {
		
		return "I can't fly";
	}
}
