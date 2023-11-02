// wirte a program to perform Multilevel inheritance

// Base class
class Person {
    protected String name;

    public Person(String name) {
        this.name = name;
    }

    public void display() {
        System.out.println("Name: " + name);
    }
}

// Derived class inheriting from Person
class Student extends Person {
    protected int studentId;

    public Student(String name, int studentId) {
        super(name);
        this.studentId = studentId;
    }

    public void displayStudent() {
        System.out.println("Student ID: " + studentId);
    }
}

// Derived class inheriting from Student
class UndergraduateStudent extends Student {
    private String major;

    public UndergraduateStudent(String name, int studentId, String major) {
        super(name, studentId);
        this.major = major;
    }

    public void displayMajor() {
        System.out.println("Major: " + major);
    }
}

// Main class to test the multilevel inheritance
public class Multilevelinheritance {
    public static void main(String[] args) {
        // Creating an instance of the derived class
        UndergraduateStudent undergrad = new UndergraduateStudent("John Doe", 12345, "Computer Science");
        // Accessing methods and attributes from the base, intermediate, and derived class
        undergrad.display();
        undergrad.displayStudent();
        undergrad.displayMajor();
    }
}


// Name: John Doe
// Student ID: 12345
// Major: Computer Science