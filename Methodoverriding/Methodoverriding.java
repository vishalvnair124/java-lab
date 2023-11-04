// wirte java program for perform Method Overriding

// Superclass
class Employee {
    protected String name;
    protected double baseSalary;

    public Employee(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Base Salary: " + baseSalary);
    }

    public double calculateSalary() {
        // Basic salary calculation
        return baseSalary;
    }
}

// Subclasses
class Manager extends Employee {
    private double bonus;

    public Manager(String name, double baseSalary, double bonus) {
        super(name, baseSalary);
        this.bonus = bonus;
    }

    @Override
    public double calculateSalary() {
        // Salary calculation for managers including bonus
        return baseSalary + bonus;
    }
}

class Engineer extends Employee {
    private double overtimePay;

    public Engineer(String name, double baseSalary, double overtimePay) {
        super(name, baseSalary);
        this.overtimePay = overtimePay;
    }

    @Override
    public double calculateSalary() {
        // Salary calculation for engineers including overtime pay
        return baseSalary + overtimePay;
    }
}

// Main class
public class Methodoverriding {
    public static void main(String[] args) {
        Employee employee1 = new Manager("John Doe", 5000, 1000);
        Employee employee2 = new Engineer("Jane Smith", 4000, 500);

        employee1.displayInfo();
        System.out.println("Total Salary: " + employee1.calculateSalary());

        System.out.println();

        employee2.displayInfo();
        System.out.println("Total Salary: " + employee2.calculateSalary());
    }
}

// Name: John Doe
// Base Salary: 5000.0
// Total Salary: 6000.0

// Name: Jane Smith
// Base Salary: 4000.0
// Total Salary: 4500.0