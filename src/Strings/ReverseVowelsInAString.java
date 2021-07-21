package Strings;

import java.util.Locale;
import java.util.Scanner;

public class ReverseVowelsInAString {
    public static void main(String[] args) {
        Scanner stringScanner = new Scanner(System.in);
        System.out.println("Enter String:");
        String inputString = stringScanner.nextLine();

        /*String inputString = "Hello world";*/
        System.out.println("Reversed vowel String \n" + reverseVowels(inputString));
    }

    private static String reverseVowels(String inputString) {
        int left = 0;
        int right = inputString.length() - 1;
        char[] charArray = inputString.toCharArray();

        while (left < right) {
            boolean isLeftVowel = isVowel(charArray[left]);
            boolean isRightVowel = isVowel(charArray[right]);

            if (!isLeftVowel) {
                left++;
                continue;
            }
            if (!isRightVowel) {
                right--;
                continue;
            }

            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;
            left++;
            right--;
        }

        return String.valueOf(charArray);
    }


    private static boolean isVowel(char c) {
        String inputChar = Character.toString(c);
        inputChar = inputChar.toLowerCase(Locale.ROOT);
        return (
                inputChar.equals("a") ||
                        inputChar.equals("e") ||
                        inputChar.equals("i") ||
                        inputChar.equals("o") ||
                        inputChar.equals("u")
        );
    }
}



