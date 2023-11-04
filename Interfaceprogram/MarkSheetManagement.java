//write a program for perform calculation of sudent MarkSheet

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// Interface for a student
interface Student {
    void getGrade();
}

// Interface for calculating the average marks
interface Calculate {
    void getAverage();
}

// Implementation of Student and Calculate interfaces
class MarkSheet implements Student, Calculate {
    private String name;
    private double[] marks = new double[3];

    MarkSheet(String name, double[] marks) {
        this.name = name;
        this.marks = marks;
    }

    @Override
    public void getGrade() {
        double total = marks[0] + marks[1] + marks[2];
        double average = total / 3;

        System.out.println("Average marks for " + name + ": " + average);

        if (average >= 80) {
            System.out.println("Grade for " + name + ": A");
        } else if (average >= 60) {
            System.out.println("Grade for " + name + ": B");
        } else if (average >= 40) {
            System.out.println("Grade for " + name + ": C");
        } else {
            System.out.println("Grade for " + name + ": D");
        }
    }

    @Override
    public void getAverage() {
        double total = marks[0] + marks[1] + marks[2];
        double average = total / 3;
        System.out.println("Average marks for " + name + ": " + average);
    }
}

// Main class to demonstrate the student mark sheet program
public class MarkSheetManagement {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter student name:");
        String name = reader.readLine();

        double[] marks = new double[3];
        System.out.println("Enter marks for three subjects:");

        for (int i = 0; i < 3; i++) {
            System.out.print("Subject " + (i + 1) + ": ");
            marks[i] = Double.parseDouble(reader.readLine());
        }

        MarkSheet markSheet = new MarkSheet(name, marks);

        // Calculate and display the grade for the student
        markSheet.getGrade();

        // Close the reader
        reader.close();
    }
}

// Enter student name:
// vishal v nair
// Enter marks for three subjects:
// Subject 1: 99
// Subject 2: 99
// Subject 3: 100
// Average marks for vishal v nair: 99.33333333333333
// Grade for vishal v nair: A