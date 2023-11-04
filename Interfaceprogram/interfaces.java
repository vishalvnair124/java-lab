//write a java program for perform M

// Interface for a shape
interface Shape {
    double calculatePerimeter();
}

// Implementation of the Shape interface for a rectangle
class Rectangle implements Shape {
    private double length;
    private double width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (length + width);
    }
}

// Implementation of the Shape interface for a circle
class Circle implements Shape {
    private double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}

// Main class to demonstrate the shape program
public class interfaces {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(5, 3);
        Shape circle = new Circle(4);

        // Calculate and display perimeter of rectangle
        System.out.println("Perimeter of Rectangle: " + rectangle.calculatePerimeter());

        // Calculate and display perimeter of circle
        System.out.println("Perimeter of Circle: " + circle.calculatePerimeter());
    }
}


// Perimeter of Rectangle: 16.0
// Perimeter of Circle: 25.132741228718345