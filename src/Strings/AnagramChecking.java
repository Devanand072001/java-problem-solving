package Strings;

import java.util.Arrays;
import java.util.Scanner;

/*anagrams are two words that has same length and same alphabets
 * eg: listen - silent
 *      care - race
 *      heart - earth
 *      Astronomer = Moon starer.
 *     The eyes = They see.
 * */
public class AnagramChecking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("String 1: ");
        String string1 = scanner.nextLine();
        System.out.println("String 2: ");
        String string2 = scanner.nextLine();

        checkAnagram(string1, string2);
    }

    private static void checkAnagram(String string1, String string2) {
        String[] stringArray1 = string1.toLowerCase().split("");
        String[] stringArray2 = string2.toLowerCase().split("");

        Arrays.sort(stringArray1);
        Arrays.sort(stringArray2);


        StringBuilder builder1 = new StringBuilder();
        StringBuilder builder2 = new StringBuilder();
        //to ignore space " "
        for (String string : stringArray1) {
            if (!string.equals(" ")) {
                builder1.append(string);
            }
        }
        for (String string : stringArray2) {
            if (!string.equals(" ")) {
                builder2.append(string);
            }
        }
        String str1 = builder1.toString();
        String str2 = builder2.toString();
        //to check anagram
        boolean isAnagram = isAnagram(str1, str2);
        if (isAnagram) {
            System.out.println(string1 + " and " + string2 + " are Anagrams");
        } else {
            System.out.println(string1 + " and " + string2 + " are not Anagrams");
        }
    }

    private static boolean isAnagram(String str1, String str2) {
        return str1.length() == str2.length() && str1.equals(str2);
    }
}
