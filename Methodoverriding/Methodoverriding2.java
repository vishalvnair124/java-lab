// wirte java program for perform Method Overriding


class Person {
    String name;

    Person(String name) {
        this.name = name;
    }

    void displayInfo() {
        System.out.println("Person's information");
    }
}

class Student extends Person {
    Student(String name) {
        super(name);
    }

    void displayInfo() {
        System.out.println("Student's name is " + name);
    }
}

class Employee extends Person {
    Employee(String name) {
        super(name);
    }

    void displayInfo() {
        System.out.println("Employee's name is " + name);
    }
}

public class Methodoverriding2 {
    public static void main(String[] args) {
        Person person = new Person("John Doe"); // Person reference and object
        person.displayInfo(); // Calls the method in Person class

        Person student = new Student("Alice Smith"); // Person reference but Student object
        student.displayInfo(); // Calls the method in Student class

        Person employee = new Employee("Michael Johnson"); // Person reference but Employee object
        employee.displayInfo(); // Calls the method in Employee class
    }
}

// Person's information
// Student's name is Alice Smith
// Employee's name is Michael Johnson