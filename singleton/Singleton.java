package singleton;

public class Singleton {
    private static Singleton Finstance = null;
    private Singleton(){}

    public static Singleton getInstance(){
        if (Finstance == null){
            Finstance = new Singleton();
        }
        return Finstance;
    }


}
