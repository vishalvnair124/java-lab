// Write a program that calculates the average of all elements in a floating-point array.

package array;

import java.util.Scanner;

public class demo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float[] arr;

        System.out.print("Enter how many element you want:");
        int n = sc.nextInt();
        arr = new float[n];
        System.out.println("Enter elements");
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + (i + 1) + ":");
            arr[i] = sc.nextFloat();
        }
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }
        System.out.println((sum / n));
    }

}
