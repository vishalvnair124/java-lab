public class Main {
    public static void main(String[] args) {
        int num = 153, original = num, sum = 0;
        
        while (num > 0) {
            int digit = num % 10;
            sum += digit * digit * digit;
            num /= 10;
        }
        
        System.out.println(original == sum ? "Armstrong Number" : "Not an Armstrong Number");
    }
}
