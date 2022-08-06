package factory_pattern;

public abstract class EnmyShip {
    private String name;
    private double speed;
    private double directionX;
    private double directionY;
    private double amtDamage;


    public void setName(String name){this.name = name;}
    public String getName(){return name;}

    public void setDamage(double amtDamage){this.amtDamage = amtDamage;}
    public double getDamage(){return amtDamage;}


    public void followHeroShip(){
        System.out.println(getName()+" ship is following hero ship.");
    }

    public void displayEnmyShip(){
        System.out.println(getName() +" ship is on screen.");
    }

    public void enmyShipShoot(){
        System.out.println(getName() +"attacks and does" +getDamage() +"damage to hero");
    }

}
