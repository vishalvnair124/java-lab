public class Main {
    public static void main(String[] args) {
        int limit = 10, a = 0, b = 1;
        
        System.out.print(a + " " + b);
        for (int i = 2; i < limit; i++) {
            int c = a + b;
            System.out.print(" " + c);
            a = b;
            b = next;
        }
    }
}
