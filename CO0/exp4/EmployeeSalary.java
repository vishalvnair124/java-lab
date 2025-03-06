import java.util.Scanner;

public class EmployeeSalary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        System.out.println("Enter job role (1-Manager, 2-Developer, 3-Intern): ");
        int role = sc.nextInt();
    
        System.out.println("Enter years of experience: ");
        int experience = sc.nextInt();
        
        double baseSalary;
        
     
        switch (role) {
            case 1: baseSalary = 80000; break; 
            case 2: baseSalary = 50000; break; 
            case 3: baseSalary = 20000; break; 
            default: 
                System.out.println("Invalid job role!");
                return;
        }

        
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
