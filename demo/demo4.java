public class demo4 {
    public static void main(String[] args) {

        System.out.println("start of break loop");
        int bal=100;
        for (int i = 0; i < 10; i++) {
            if (bal < 0) {
                break; // Exit the loop when i equals 5
            }
            System.out.println(bal);
            bal-=50;
        }
        System.out.println("end of break loop\n");
        
        System.out.println("start of continue loop");
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                continue; // Skip even numbers
            }
            System.out.println(i);
        }
        System.out.println("end of continue loop");
    }
}
