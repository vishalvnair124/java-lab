// Write a program that calculates the sum of all elements in an integer array.

package array;

import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr;

        System.out.print("Enter how many element you want:");
        int n = sc.nextInt();
        arr = new int[n];
        System.out.println("Enter elements");
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + (i + 1) + ":");
            arr[i] = sc.nextInt();
        }
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }
        System.out.println(sum);
    }
}
