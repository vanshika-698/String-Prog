public class DuplicateString {
    public static void main(String[] args) {
        String input = "abca";
        countDuplicates(input);
    }

    public static void countDuplicates(String str) {
        int[] count = new int[256]; 

       
        for (char c : str.toCharArray()) {
            count[c]++;
        }

    
        for (char c = 0; c < count.length; c++) {
            if (count[c] > 1) {
                System.out.println(c + "-" + count[c]);
            }
        }
    }
}
