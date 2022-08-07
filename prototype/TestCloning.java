package prototype;

public class TestCloning {
    public static void main(String[] args) {
        CloneFactory animalMaker = new CloneFactory();

        Sheep sally = new Sheep();
        Sheep t = (Sheep)sally.makeCopy();
        Sheep clonedSheep = (Sheep) animalMaker.getClone(sally);

        System.out.println(sally);
        System.out.println(t);
        System.out.println(clonedSheep);
        System.out.println("sally hash code" + System.identityHashCode(sally));
        System.out.println("cloned hash code" + System.identityHashCode(clonedSheep));
    }
}
