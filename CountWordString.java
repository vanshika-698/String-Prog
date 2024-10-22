import java.util.*;
public class CountWordString {
    public static void main(String[] args) {
        String input = "Hi Hello These";
        int count = countWords(input);
        System.out.println("count -> " + count); 
    }

    public static int countWords(String str) {
   
        String[] words = str.trim().split("\\s+");
        return words.length;
    }
}
