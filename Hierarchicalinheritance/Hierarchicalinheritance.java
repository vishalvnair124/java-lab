// wirte a program to perform Hierarchical inheritance

// Base class

class Employee {
    protected String name;
    protected double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Salary: $" + salary);
    }
}

// Derived class 1 inheriting from Employee
class Manager extends Employee {
    private String department;

    public Manager(String name, double salary, String department) {
        super(name, salary);
        this.department = department;
    }

    public void displayDepartment() {
        System.out.println("Department: " + department);
    }
}

// Derived class 2 inheriting from Employee
class Staff extends Employee {
    private String role;

    public Staff(String name, double salary, String role) {
        super(name, salary);
        this.role = role;
    }

    public void displayRole() {
        System.out.println("Role: " + role);
    }
}

// Main class to test the hierarchical inheritance
public class Hierarchicalinheritance {
    public static void main(String[] args) {
        // Creating instances of the derived classes
        Manager manager = new Manager("John Doe", 5000, "Engineering");
        Staff staff = new Staff("Jane Smith", 3000, "Developer");

        // Accessing methods and attributes from the base and derived classes
        System.out.println("Manager Details:");
        manager.display();
        manager.displayDepartment();

        System.out.println("\nStaff Details:");
        staff.display();
        staff.displayRole();
    }
}


// Manager Details:
// Name: John Doe
// Salary: $5000.0
// Department: Engineering

// Staff Details:
// Name: Jane Smith
// Salary: $3000.0
// Role: Developer