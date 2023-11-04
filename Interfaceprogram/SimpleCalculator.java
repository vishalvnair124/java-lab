import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// Interface for a simple calculator
interface Calculator {
    int calculate(int a, int b);
}

// Implementation of the Calculator interface for addition
class AddCalculator implements Calculator {
    @Override
    public int calculate(int a, int b) {
        return a + b;
    }
}

// Implementation of the Calculator interface for subtraction
class SubtractCalculator implements Calculator {
    @Override
    public int calculate(int a, int b) {
        return a - b;
    }
}

// Main class to demonstrate the simple calculator program with user input
public class SimpleCalculator {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter two numbers separated by space:");
        String[] input = reader.readLine().split(" ");
        int num1 = Integer.parseInt(input[0]);
        int num2 = Integer.parseInt(input[1]);

        Calculator addCalculator = new AddCalculator();
        Calculator subtractCalculator = new SubtractCalculator();

        // Calculate and display the sum
        System.out.println("Sum: " + addCalculator.calculate(num1, num2));

        // Calculate and display the difference
        System.out.println("Difference: " + subtractCalculator.calculate(num1, num2));

        // Close the reader
        reader.close();
    }
}
