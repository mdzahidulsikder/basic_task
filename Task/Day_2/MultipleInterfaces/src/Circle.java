public class Circle extends Shape implements Drawable, Resizable{
    protected double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }

    @Override
    public void draw() {
        System.out.println("Drawing Circle....");
    }

    @Override
    public void resize(double factor) {
        radius *= factor;
        System.out.print("Resize : ");
    }

    @Override
    double calculateArea() {
        return Math.PI*Math.pow(radius,2);
    }

    @Override
    double calculatePerimeter() {
        return 4*radius;
    }
}
