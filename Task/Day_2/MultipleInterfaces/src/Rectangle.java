public class Rectangle extends Shape implements Drawable, Resizable{
    private double width;
    private double length;

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", length=" + length +
                '}';
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    @Override
    public void draw() {
        System.out.println("Rectangle is drawing...");
    }

    @Override
    public void resize(double factor) {
        width *=factor;
        length *=factor;
        System.out.print("Resize: ");
    }

    @Override
    double calculateArea() {
        return width*length;
    }

    @Override
    double calculatePerimeter() {
        return 2*(length+width);
    }
}
