public class PhysicalProduct extends Product{
    protected double weight;



    public PhysicalProduct(String productName, double price, double weight) {
        super(productName, price);
        this.weight = weight;
    }


    @Override
    public double calculateFinalPrice() {
        double shippingCost = weight * 0.1;
        return shippingCost+price;
    }
}
