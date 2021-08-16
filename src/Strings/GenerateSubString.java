package Strings;

public class GenerateSubString {
    public static void main(String[] args) {
        String string = "abcd";
        for (int i = 0; i < string.length(); i++) {
            for (int j = i + 1; j <= string.length(); j++) {
                System.out.println(string.substring(i, j));
            }
        }
    }
}
