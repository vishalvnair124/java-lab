// wirte a program to perform single inheritance

// Base class
class Vehicle {
    protected String brand;

    public Vehicle(String brand) {
        this.brand = brand;
    }

    public void display() {
        System.out.println("This is a " + brand + " vehicle.");
    }
}

// Derived class inheriting from the Vehicle class
class Car extends Vehicle {
    private String model;

    public Car(String brand, String model) {
        super(brand);
        this.model = model;
    }

    public void showDetails() {
        System.out.println("Brand: " + brand + ", Model: " + model);
    }
}

// Main class to test the single inheritance
public class Singleinheritance {
    public static void main(String[] args) {
        // Creating an instance of the derived class
        Car car = new Car("Toyota", "Camry");
        // Accessing methods and attributes from the base and derived class
        car.display();
        car.showDetails();
    }
}

// This is a Toyota vehicle.
// Brand: Toyota, Model: Camry