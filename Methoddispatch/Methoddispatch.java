// wirte java program for perform Dynamic Method dispatch

class Shape {
    void calculateArea() {
        System.out.println("Calculating area of Shape");
    }
}

class Rectangle extends Shape {
    private double length;
    private double width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

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

    void calculateArea() {
        double area = Math.PI * radius * radius;
        System.out.println("Area of Circle: " + area);
    }
}


public class Methoddispatch {
    public static void main(String[] args) {
        Shape shape;
        shape = new Shape();
        shape.calculateArea();

        shape = new Rectangle(5, 3);
        shape.calculateArea(); // Calls the calculateArea method of Rectangle

        shape = new Circle(4);
        shape.calculateArea(); // Calls the calculateArea method of Circle

       
    }
}

// Calculating area of Shape
// Area of Rectangle: 15.0
// Area of Circle: 50.26548245743669