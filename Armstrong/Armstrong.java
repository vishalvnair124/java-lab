// wirte a java program to check the given number is armstrong or not

import java.util.Scanner;

class Armstrong {
    public static void main(String nandhu[]) {
        int am = 0, rem;
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter a number :");
        int num = obj.nextInt();
        int x = num;
        while (num != 0) {
            rem = num % 10;
            am = am + rem * rem * rem;
            num = num / 10;
        }
        if (am == x)
            System.out.print("You Enterd an AMSTRONG number :" + x);
        else
            System.out.print("You Enterd NOT an AMSTRONG number :" + x);

    }
}


// Enter a number :153
// You Enterd an AMSTRONG number :153