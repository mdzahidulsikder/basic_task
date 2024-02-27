public class Rectangle extends Shape{
    private  double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateArea(){
        return height*width;
    }

    @Override
    public double calculatePerimeter(){
        return 2*(height+width);
    }


}
