public class SubString {
    public static void main(String[] args) {
        String mainString = "Hi, Hello Good Morning";
        String subString = "Hello";

        if (isSubstringPresent(mainString, subString)) {
            System.out.println("Substring is present"); 
        } else {
            System.out.println("Substring is not present");
        }
    }

    public static boolean isSubstringPresent(String mainString, String subString) {
        return mainString.contains(subString);
    }
}
