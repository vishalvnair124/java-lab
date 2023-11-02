// wirte java program for perform String sorting

import java.util.Scanner;

public class Stringsorting2{
    public static void main(String[] args) {
        int n, i, j;
        String temp;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of strings: ");
        n = scanner.nextInt();
        String[] arr = new String[n];
        scanner.nextLine(); // consume the newline character
        System.out.println("Enter the strings: ");
        for (i = 0; i < n; i++) {
            arr[i] = scanner.nextLine();
        }

        System.out.println("Array before sorting: ");
        for (i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        for (i = 0; i < n; i++) {
            for (j = 1; j < (n - i); j++) {
                if (arr[j - 1].compareTo(arr[j]) > 0) {
                    // swap elements
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.println("\nArray after sorting: ");
        for (i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        scanner.close();
    }
}


// Enter the number of strings: 5
// Enter the strings:
// vishal
// hari
// biju
// nandhu
// sooraj
// Array before sorting:
// vishal hari biju nandhu sooraj
// Array after sorting:
// biju hari nandhu sooraj vishal