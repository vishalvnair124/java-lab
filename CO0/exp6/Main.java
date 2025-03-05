public class Main {
    public static void main(String[] args) {
        int num = 121, reversed = 0, original = num;
        
        while (num > 0) {
            reversed = reversed * 10 + num % 10;
            num /= 10;
        }
        
        System.out.println(original == reversed ? "Palindrome" : "Not a Palindrome");
    }
}
