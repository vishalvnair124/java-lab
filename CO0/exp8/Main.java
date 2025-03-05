public class Main {
    public static void main(String[] args) {
        int limit = 10, a = 0, b = 1;
        
        System.out.print(a + " " + b);
        for (int i = 2; i < limit; i++) {
            int next = a + b;
            System.out.print(" " + next);
            a = b;
            b = next;
        }
    }
}
