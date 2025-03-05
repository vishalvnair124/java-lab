public class Main {
    public static void main(String[] args) {
        String text = "Hello World";
        int vowels = 0, consonants = 0;
        text = text.toLowerCase();
        
        for (char ch : text.toCharArray()) {
            if (ch >= 'a' && ch <= 'z') {
                if ("aeiou".indexOf(ch) != -1) vowels++;
                else consonants++;
            }
        }
        
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
    }
}
