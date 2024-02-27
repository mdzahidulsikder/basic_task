//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Product[] products = new Product[4];
        products[0] = new PhysicalProduct("Orange", 200, 25);
        products[1] = new DigitalProduct("E-book",1000);
        products[2] = new PhysicalProduct("Apple", 250, 15);
        products[3] = new DigitalProduct("Software's" , 5000);

        for (Product product : products) {
            System.out.println("Product: " + product.getProductName());
            System.out.println("Final Price: $" + product.calculateFinalPrice());
            System.out.println(); // Empty line for separation
        }
    }
}