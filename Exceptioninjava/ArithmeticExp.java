



//wirte  program for showing arithmetic exception 

import java.io.*;

class ArithmeticExp  {
    public static void main(String[] args) {
        int a ;
        int b ;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Enter the numbers");
            a = Integer.parseInt(reader.readLine());
            b = Integer.parseInt(reader.readLine());
            System.out.println(a / b);
        } catch (ArithmeticException e) {
            System.out.println("Sorry, Divided by Zero");
            
        } catch (IOException e) {
            System.out.println("An error occurred while reading input: " );
        } catch (NumberFormatException e) {
            System.out.println("Invalid input format: ");
        }
        catch (Exception e) {
            System.out.println("Something wrong.... ");
        }
    }
}


// Enter the numbers
// 5
// 0
// Sorry, Divided by Zero