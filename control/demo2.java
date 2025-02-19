// Sum of Digits: Write a program that prompts the user to enter a positive 
// integer and then calculates and prints the sum of its digits. For example, if the 
// user enters 123, the program should calculate and print 1 + 2 + 3 = 6

package control;

public class demo2 {
    public static void main(String[] args) {
        int num=123,sum=0;
        while (num>0) {
            sum+=num%10;
            num=num/10;
        }
        System.out.println("sum :"+sum);
    }
}
