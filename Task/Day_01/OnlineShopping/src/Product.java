public class Product {
    protected String productName;
    protected double price;

    public Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
    }



    public String getProductName() {
        return productName;
    }

    public double calculateFinalPrice() {
        return price;
    }
}
