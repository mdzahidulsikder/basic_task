public class Main {
    public static void main(String[] args) {

        /**
         * Rectangle calculation area and perimeter.
         */

        Rectangle rectangle = new Rectangle(5, 10);

        System.out.println("...............Rectangle.................\n" + rectangle);

        double rectangleArea = rectangle.calculateArea();
        double perimeterArea = rectangle.calculatePerimeter();
        rectangle.draw();
        System.out.println("Rectangle Area: "+rectangleArea);
        System.out.println("Rectangle perimeter: " +perimeterArea);
        rectangle.resize(10);
        System.out.println(rectangle);

        /**
         * Circle calculation area and perimeter
         */


        Circle circle = new Circle(10);
        System.out.println("...............Circle.................\n"+ circle);

        double circleArea = circle.calculateArea();
        double circlePerimeter = circle.calculatePerimeter();
        circle.resize(5);
        circle.draw();
        System.out.println("Circle Area: "+circleArea);
        System.out.println("Circle Perimeter: "+circlePerimeter);
        System.out.println(circle);


    }
}
