
class Employee {
    private String name;
    private int employeeId;
    private double salary;

    // Constructor with name parameter
    public Employee(String name) {
        this.name = name;
    }

    // Constructor with name and employeeId parameters
    public Employee(String name, int employeeId) {
        this.name = name;
        this.employeeId = employeeId;
    }

    // Constructor with name, employeeId, and salary parameters
    public Employee(String name, int employeeId, double salary) {
        this.name = name;
        this.employeeId = employeeId;
        this.salary = salary;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Salary: " + salary);
    }
}

class Constructoroverloading {
    public static void main(String[] args) {
        Employee emp1 = new Employee("John Doe");
        Employee emp2 = new Employee("Jane Smith", 12345);
        Employee emp3 = new Employee("Mike Johnson", 67890, 5000.0);

        emp1.display();
        System.out.println();
        emp2.display();
        System.out.println();
        emp3.display();
    }
}
