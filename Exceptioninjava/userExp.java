
//wirte  program for showing user defined exception 
import java.util.Scanner;

// class representing custom exception
class InvalidAgeException extends Exception {
    public InvalidAgeException(String str) {
        // calling the constructor of parent Exception
        super(str);
    }
}

// class that uses custom exception InvalidAgeException
public class userExp {

    // method to check the age
    static void validate(int age) throws InvalidAgeException {
        if (age < 18) {

            // throw an object of user-defined exception
            throw new InvalidAgeException("Age is not valid to vote");
        } else {
            System.out.println("Age is valid to vote");
        }
    }

    // main method
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        try {
            // Ask the user for input
            System.out.print("Enter your age: ");

            // Read the integer input
            int age = scanner.nextInt();

            // calling the method
            validate(age);
        } catch (InvalidAgeException ex) {
            System.out.println("Caught the exception");

            // printing the message from InvalidAgeException object
            System.out.println("Exception occurred: " + ex);
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter a valid integer.");
        } 
        
    }
}


// Enter your age: 6
// Caught the exception
// Exception occurred: InvalidAgeException: Age is not valid to vote