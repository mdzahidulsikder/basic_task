public abstract class Vehicle {
    protected double positionX;
    protected double positionY;

    public Vehicle(double x, double y) {
        this.positionX = x;
        this.positionY = y;
    }

    abstract void displayInfo();


}
