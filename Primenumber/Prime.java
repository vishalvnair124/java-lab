// wirte a java program to find prime numbers under a given limit

import java.util.Scanner;

class Prime {
   public static void main(String nandhu[]) {
      int i, count;
      Scanner obj = new Scanner(System.in);
      System.out.print("Enter a limit: ");
      int lim = obj.nextInt();
      System.out.println("Prime numbers are:");
      for (int num = 2; num <= lim; num++) {
         count = 0;
         for (i = 2; i <= (num / 2); i++) {
            if (num % i == 0) {
               count = 1;
               break;
            }
         }
         if (count == 0) {
            System.out.print(num + " ");
         }
      }
   }
}


// Enter a limit: 10
// Prime numbers are:
// 2 3 5 7