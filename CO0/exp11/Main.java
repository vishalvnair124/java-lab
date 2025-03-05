import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] words = {"banana", "apple", "cherry", "date"};
        Arrays.sort(words);
        
        for (String word : words) {
            System.out.print(word + " ");
        }
    }
}
