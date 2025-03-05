import java.util.Scanner;

public class EmployeeSalary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input job role
        System.out.println("Enter job role (1-Manager, 2-Developer, 3-Intern): ");
        int role = sc.nextInt();
        
        // Input experience
        System.out.println("Enter years of experience: ");
        int experience = sc.nextInt();
        
        double baseSalary;
        
        // Assign base salary based on role
        switch (role) {
            case 1: baseSalary = 80000; break; // Manager salary
            case 2: baseSalary = 50000; break; // Developer salary
            case 3: baseSalary = 20000; break; // Intern salary
            default: 
                System.out.println("Invalid job role!");
                return;
        }

        // Calculate bonus
        double bonus = 0;
        if (experience >= 3 && experience <= 5) {
            bonus = baseSalary * 0.10;
        } else if (experience > 5) {
            bonus = baseSalary * 0.20;
        }
        
        double finalSalary = baseSalary + bonus;
        System.out.println("Final salary: $" + finalSalary);
        
        sc.close();
    }
}
