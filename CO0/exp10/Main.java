public class Main {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        
        for (int i = 0; i < matrix.length; i++) {
            int rowSum = 0, colSum = 0;
            for (int j = 0; j < matrix[0].length; j++) {
                rowSum += matrix[i][j];
                colSum += matrix[j][i];
            }
            System.out.println("Row " + i + "    Sum: " + rowSum);
            System.out.println("Column " + i + " Sum: " + colSum);
        }
    }
}
