import java.util.Scanner;

public class AreaPerimeterCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
      
        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();
        double circleArea = Math.PI * radius * radius;
        double circlePerimeter = 2 * Math.PI * radius;
        System.out.println("Circle Area: " + circleArea);
        System.out.println("Circle Perimeter: " + circlePerimeter);
        
       
        System.out.print("Enter the length of the rectangle: ");
        double length = scanner.nextDouble();
        System.out.print("Enter the width of the rectangle: ");
        double width = scanner.nextDouble();
        double rectangleArea = length * width;
        double rectanglePerimeter = 2 * (length + width);
        System.out.println("Rectangle Area: " + rectangleArea);
        System.out.println("Rectangle Perimeter: " + rectanglePerimeter);
        
        scanner.close();
    }
}
