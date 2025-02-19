public class OperatorExample {
    public static void main(String[] args) {
        // Arithmetic operators
        int a = 10;
        int b = 5;
        int sum = a + b;          // Addition
        int difference = a - b;   // Subtraction
        int product = a * b;      // Multiplication
        int quotient = a / b;     // Division
        int remainder = a % b;    // Modulus (remainder after division)
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);
        System.out.println("Remainder: " + remainder);

        // Assignment operators
        int x = 10;
        x += 5;  // Equivalent to x = x + 5
        System.out.println("x: " + x);

        // Comparison operators
        int num1 = 10;
        int num2 = 20;
        System.out.println("Is num1 equal to num2? " + (num1 == num2));  // Equal to
        System.out.println("Is num1 not equal to num2? " + (num1 != num2));  // Not equal to
        System.out.println("Is num1 greater than num2? " + (num1 > num2));  // Greater than
        System.out.println("Is num1 less than num2? " + (num1 < num2));  // Less than
        System.out.println("Is num1 greater than or equal to num2? " + (num1 >= num2));  // Greater than or equal to
        System.out.println("Is num1 less than or equal to num2? " + (num1 <= num2));  // Less than or equal to

        // Logical operators
        boolean p = true;
        boolean q = false;
        System.out.println("p AND q: " + (p && q));  // Logical AND
        System.out.println("p OR q: " + (p || q));   // Logical OR
        System.out.println("NOT p: " + (!p));        // Logical NOT

        // Conditional (Ternary) operator
        int num = 15;
        String result = (num % 2 == 0) ? "even" : "odd";  // If num is even, result is "even", otherwise "odd"
        System.out.println("Number is " + result);
    }
}
