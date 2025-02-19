import java.util.Scanner;

public class AdmissionChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input for subject marks
        System.out.print("Enter Mathematics marks: ");
        int math = scanner.nextInt();
        System.out.print("Enter Physics marks: ");
        int physics = scanner.nextInt();
        System.out.print("Enter Chemistry marks: ");
        int chemistry = scanner.nextInt();

        // Total marks calculation
        int total = math + physics + chemistry;

        // Checking admission eligibility with minimal if statements
        if (math >= 60 && physics >= 50 && chemistry >= 40 && total >= 200) {
            System.out.println("Admission Granted");
        } else {
            System.out.println("Admission Denied");
        }

        scanner.close();
    }
}
