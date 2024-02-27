//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Vehicle[] vehicles = new Vehicle[4];
        vehicles[0] = new Car("01 February 2022", "TATA01", 5);
        vehicles[1] = new Motorcycle("07 September 2021", "Ambassador",05);
        vehicles[2]= new Vehicle("16 October 2015", "SUZUKI", 12);
        vehicles[3] = new Vehicle("23 November 2011","SUZUKI",3);

        for (Vehicle v:vehicles){
            System.out.println("..............................");
            v.display();
        }

    }
}