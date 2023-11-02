// wirte java program for perform String sorting

import java.util.Arrays;
import java.util.Scanner;

public class Stringsorting1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of strings: ");
        int n = scanner.nextInt();
        String[] arr = new String[n];
        scanner.nextLine(); // consume the newline character
        System.out.println("Enter the strings: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextLine();
        }
        System.out.println("Array before sorting: ");
        for (String str : arr) {
            System.out.print(str + " ");
        }
        Arrays.sort(arr);
        System.out.println("\nArray after sorting: ");
        for (String str : arr) {
            System.out.print(str + " ");
        }
    }
}

// Enter the number of strings: 5
// Enter the strings: 
// vishal
// nandhu
// hari
// biju
// sooraj
// Array before sorting: 
// vishal nandhu hari biju sooraj 
// Array after sorting:
// biju hari nandhu sooraj vishal