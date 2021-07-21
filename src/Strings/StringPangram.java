package Strings;

public class StringPangram {
    public static void main(String[] args) {
        /*String string = "The quick Brown fox jumps Over a Lazy Dog";*/
        String string = "Pack my box with five dozen liquor jugs";
        string = string.toLowerCase();

        String tempString = "";
        for (char i = 'a'; i <= 'z'; i++) {
//            System.out.println(i);
            if (string.contains(Character.toString(i))) {
                tempString = tempString + i;

            }
        }
        if (tempString.length() == 26) {
            System.out.println("Pangram");
        } else {
            System.out.println("Not pangram");
        }
    }
}
