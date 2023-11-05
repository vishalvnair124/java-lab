//write a java program for perform Extending interface

interface Shape {
    double calculateArea();
}

interface ThreeDimensionalShape extends Shape {
    double calculateVolume();
}

class Sphere implements ThreeDimensionalShape {
    private double radius;

    public Sphere(double radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        return 4 * Math.PI * radius * radius;
    }

    public double calculateVolume() {
        return (4.0 / 3.0) * Math.PI * radius * radius * radius;
    }
}

public class Main {
    public static void main(String[] args) {
        Sphere sphere = new Sphere(5);
        System.out.println("Area of sphere: " + sphere.calculateArea());
        System.out.println("Volume of sphere: " + sphere.calculateVolume());
    }
}

// Area of sphere: 314.1592653589793
// Volume of sphere: 523.5987755982989