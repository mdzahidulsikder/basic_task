public class Airplane extends Vehicle implements Flyable{
    public Airplane(double x, double y) {
        super(x, y);
    }
    @Override
    public void takeOff() {
        System.out.println("Airplane taking off...");
    }
    @Override
    public void flyTo(double x, double y) {
        System.out.println("Airplane flying to: (" + x + ", " + y + ")");
        this.positionX = x;
        this.positionY = y;
    }
    @Override
    public void land() {
        System.out.println("Airplane landing...");
    }
    @Override
    void displayInfo() {
        System.out.println("Airplane - Position: (" + positionX + ", " + positionY + ")");
    }
}
