import java.util.Scanner;

public class check {
    public static boolean isSymmetric(int[][] matrix, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] != matrix[j][i]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the matrix (n x n): ");
        int n = scanner.nextInt();
        int[][] matrix = new int[n][n];
        
        System.out.println("Enter the matrix elements:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        
        if (isSymmetric(matrix, n)) {
            System.out.println("The given matrix is symmetric.");
        } else {
            System.out.println("The given matrix is not symmetric.");
        }
        
        scanner.close();
    }
}
