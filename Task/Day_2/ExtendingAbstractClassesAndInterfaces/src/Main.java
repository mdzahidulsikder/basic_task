public class Main {
    public static void main(String[] args) {
        System.out.println("......................Car.....................");
        Car car = new Car(10,20);
        car.displayInfo();
        car.turnLeft();
        car.stop();

        System.out.println("......................Airplane.....................");
        Airplane airplane = new Airplane(30,40);
        airplane.takeOff();
        airplane.flyTo(100, 200);
        airplane.displayInfo();
        airplane.land();
    }
}
