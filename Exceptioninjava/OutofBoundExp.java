


//wirte  program for showing array index out of bounds  exception 
import java.util.Scanner;

class OutofBoundExp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            int[] arr = {1, 2, 3};
            System.out.print("Enter the index to access: ");
            int index = scanner.nextInt();
            System.out.println(arr[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index is out of bounds");
           
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}


// Enter the index to access: 9
// Array Index is out of bounds