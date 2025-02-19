

import java.util.*;

public class W03_P4 {
    public static void main(String[] args) {

        String choice = "";
        Scanner input = new Scanner(System.in);// Add your code
        int i = 0, product = 1,sum=0;
        while (true) {
            choice = input.next();

            if (choice.equals("q")) {
                break;
            } else {
                product*=Integer.valueOf(choice);
                sum+=Integer.valueOf(choice);
                i++; 
            }
      
        }

        System.out.println("Product is: " + product);
        System.out.print("Average is: " + ((double)(sum / (i))));
        

    }
}