//wirote a program to perform Method overloading


import java.util.Scanner;

public class Methodoverloading {

    // Method to calculate the area of a rectangle
    public static double calculateArea(int length, int width) {
        return length * width;
    }

    // Method to calculate the area of a circle
    public static double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }

    // Method to calculate the area of a square
    public static double calculateArea(int side) {
        return side * side;
    }

    // Method to calculate the area of a triangle
    public static double calculateArea(double base, double height) {
        return 0.5 * base * height;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the dimensions for a rectangle
        System.out.print("Enter length and width of the rectangle: ");
        int length = scanner.nextInt();
        int width = scanner.nextInt();
        System.out.println("Area of the rectangle: " + calculateArea(length, width));

        // Read the radius for a circle
        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();
        System.out.println("Area of the circle: " + calculateArea(radius));

        // Read the side for a square
        System.out.print("Enter the side of the square: ");
        int side = scanner.nextInt();
        System.out.println("Area of the square: " + calculateArea(side));

        // Read the base and height for a triangle
        System.out.print("Enter the base and height of the triangle: ");
        double base = scanner.nextDouble();
        double height = scanner.nextDouble();
        System.out.println("Area of the triangle: " + calculateArea(base, height));

        scanner.close();
    }
}

// Enter length and width of the rectangle: 5
// 10
// Area of the rectangle: 50.0
// Enter the radius of the circle: 2
// Area of the circle: 12.566370614359172
// Enter the side of the square: 5
// Area of the square: 25.0
// Enter the base and height of the triangle: 10
// 4
// Area of the triangle: 20.0