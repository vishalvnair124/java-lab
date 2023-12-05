//write a program for demonstrate user defined exception

import java.util.Scanner;

// Class representing custom exception
class InvalidAgeException extends Exception {
    public InvalidAgeException(String str) {
        // Calling the constructor of the parent Exception
        super(str);
    }
}

// Class that uses custom exception InvalidAgeException
public class userExp {

    // Main method
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        try {
            // Ask the user for input
            System.out.print("Enter your age: ");

            // Read the integer input
            int age = scanner.nextInt();

            // Calling the method
            if (age < 18) {
                // Throw an object of user-defined exception
                throw new InvalidAgeException("Age is not valid to vote");
            } else {
                System.out.println("Age is valid to vote");
            }
        } catch (InvalidAgeException e) {
            // Handle the custom exception
            System.out.println("Caught the exception");
            System.out.println("Exception occurred: " + e.getMessage());
        } catch (Exception e) {
            // Handle other exceptions (e.g., InputMismatchException)
            System.out.println("Invalid input. Please enter a valid integer.");
        } finally {
            // Close the scanner in the finally block to ensure it gets closed even if an exception occurs
            scanner.close();
        }
    }
}

// Enter your age: 15
// Caught the exception
// Exception occurred: Age is not valid to vote