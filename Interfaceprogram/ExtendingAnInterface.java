// Interface definition
interface Person {
    void displayInfo();
}

// Extended interface
interface Student extends Person {
    void study();
}

// Student class implementing the extended interface
class StudentImpl implements Student {
    private String name;

    public StudentImpl(String name) {
        this.name = name;
    }

    @Override
    public void displayInfo() {
        System.out.println("Name: " + name);
    }

    @Override
    public void study() {
        System.out.println(name + " is studying.");
    }
}

// Main class
public class ExtendingAnInterface {
    public static void main(String[] args) {
        // Creating a Student object
        StudentImpl student = new StudentImpl("John Doe");

        // Calling the methods
        student.displayInfo();
        student.study();
    }
}
