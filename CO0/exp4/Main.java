import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the designation (Manager/Developer/Intern): ");
        String designation = scanner.nextLine().trim().toLowerCase(); 

        System.out.print("Enter years of experience: ");
        int experience = scanner.nextInt();

        double baseSalary = 0;
        double bonus = 0;
        double finalSalary;

        switch (designation) {
            case "manager":
                baseSalary = 50000;
                break;
            case "developer":
                baseSalary = 30000;
                break;
            case "intern":
                baseSalary = 15000;
                break;
            default:
                System.out.println("Invalid designation! Please enter Manager, Developer, or Intern.");
                scanner.close();
                return;
        }

        if (experience >= 3 && experience <= 5) {
            bonus = 0.10 * baseSalary;
        } else if (experience > 5) {
            bonus = 0.20 * baseSalary;
        }

        finalSalary = baseSalary + bonus;
        System.out.println("\nEmployee Details:");
        System.out.println("Designation: " + designation.substring(0, 1).toUpperCase() + designation.substring(1));
        System.out.println("Experience: " + experience + " years");
        System.out.println("Base Salary: ₹" + baseSalary);
        System.out.println("Bonus: ₹" + bonus);
        System.out.println("Final Salary: ₹" + finalSalary);

        scanner.close();
    }
}