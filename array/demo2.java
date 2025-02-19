// Write a program that prompts the user to enter an integer and then searches for
// that integer in an array. If the integer is found, 
// print its index; otherwise, print a message indicating that the integer is not in the array.

package array;

import java.util.Scanner;

public class demo2 {
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

        System.out.print("Enter the element for search :");
        int s = sc.nextInt();
        boolean ist = false;
        for (int i = 0; i < n; i++) {
            if (arr[i] == s) {
                System.out.print("element in the index :" + i);
                ist = true;
                break;
            }
        }
        if (!ist)
            System.out.print("no element");
    }
}
