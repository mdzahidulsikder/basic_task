import java.util.ArrayList;
import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Shape rectangle = new Rectangle(10, 34);
        System.out.println("\nArea of Rectangle: " + rectangle.calculateArea());
        System.out.println("\nPerimeter of Rectangle: " + rectangle.calculatePerimeter());


        Shape circle = new Circle(20);
        System.out.println("\nArea of Circle: "+circle.calculateArea());
        System.out.println("\nPerimeter of Circle: "+ circle.calculatePerimeter());


        ArrayList<Shape> shapes= new ArrayList<>();

        shapes.add(new Circle(5));
        shapes.add(new Rectangle(10,20));
        shapes.add(new Circle(20));
        shapes.add(new Rectangle(50,100));


        double totalArea=0;
        double totalParameter=0;

        for (Shape shape:shapes){
            totalArea+=shape.calculateArea();
            totalParameter+=shape.calculatePerimeter();

        }

        System.out.println("\nTotal Area is : "+ totalArea);
        System.out.println("\nTotal Perimeter is : "+totalParameter);



    }
}