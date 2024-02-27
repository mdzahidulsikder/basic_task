public class Car extends Vehicle implements Navigable{

    public Car(double x, double y) {
        super(x, y);
    }


    @Override
    void displayInfo() {
        System.out.println("Car - Position: (" + positionX + ", " + positionY + ")");
    }


    @Override
    public void turnLeft() {
        System.out.println("Car turning left");
    }

    @Override
    public void turnRight() {
        System.out.println("Car turning right");
    }

    @Override
    public void stop() {
        System.out.println("Car stopped");
    }
}
