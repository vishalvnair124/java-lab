public class Main {
    public static void main(String[] args) {
        String str = "madam", reversed = new StringBuilder(str).reverse().toString();
        System.out.println(str.equals(reversed) ? "Palindrome" : "Not a Palindrome");
    }
}
