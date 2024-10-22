public class ShiftCharacterString {
    public static void main(String[] args) {
        System.out.println(shiftCharacters("abcd"));
        System.out.println(shiftCharacters("axz"));
    }

    public static String shiftCharacters(String str) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            
            char shiftedChar = (c == 'z') ? 'a' : (char) (c + 1);
            result.append(shiftedChar);
        }

        return result.toString();
    }
}
