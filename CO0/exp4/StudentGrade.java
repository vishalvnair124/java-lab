import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input percentage
        System.out.println("Enter student's percentage: ");
        int percentage = sc.nextInt();
        
        char grade;
        
        // Determine grade using if-else
        if (percentage >= 90) {
            grade = 'A';
        } else if (percentage >= 80) {
            grade = 'B';
        } else if (percentage >= 70) {
            grade = 'C';
        } else if (percentage >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }
        
        // Provide feedback using switch
        switch (grade) {
            case 'A': System.out.println("Grade: A - Excellent work!"); break;
            case 'B': System.out.println("Grade: B - Good job!"); break;
            case 'C': System.out.println("Grade: C - You can do better."); break;
            case 'D': System.out.println("Grade: D - Work harder."); break;
            case 'F': System.out.println("Grade: F - Failed. Try again."); break;
        }
        
        sc.close();
    }
}
