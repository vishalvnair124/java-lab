// Write a program to calculate the factorial of a nonnegative integer entered 
//. The factorial of a number n, denoted as
// n!, is the product of all positive integers less than or equal to n. For example, 
// the factorial of 5 (5!) is 5×4×3×2×1


package control;



public class demo {
    public static void main(String[] args) {
        int num =5;
        int factorial=1;
        for(int i=1;i<=num;i++){
            factorial*=i;
        }
        System.out.println("factorial :"+factorial);
    }
}
