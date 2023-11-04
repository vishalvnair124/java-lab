// wirte java program for perform Abstract class and Abstract method

abstract class Shape {
    abstract void calculateArea();
}

class Rectangle extends Shape {
    private double length;
    private double width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    void calculateArea() {
        double area = length * width;
        System.out.println("Area of Rectangle: " + area);
    }
}

class Circle extends Shape {
    private double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    void calculateArea() {
        double area = Math.PI * radius * radius;
        System.out.println("Area of Circle: " + area);
    }
}

public class AbstractClass{
    public static void main(String[] args) {
        Shape shape1 = new Rectangle(5, 3);
        shape1.calculateArea(); // Calls the calculateArea method of Rectangle

        Shape shape2 = new Circle(4);
        shape2.calculateArea(); // Calls the calculateArea method of Circle
    }
}

// Area of Rectangle: 15.0      
// Area of Circle: 50.26548245743669