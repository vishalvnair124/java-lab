public class demo2 {
    public static void main(String[] args) {
        int i = 10;
        System.out.println("while loop Iteration: " );
        while (i < 5) {
            System.out.println("Iteration: " + i);
            i++;
        }
        System.out.println("do - while loop Iteration: " );
        i = 10;
        do {
            System.out.println("Iteration: " + i);
            i++;
        } while (i < 5);

    }
}
