package Strings;

import java.util.Scanner;

public class StringPermutation {
    public static void main(String[] args) {
        System.out.println("Enter inputString: ");
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.next();
        stringPermutations(inputString);
    }

    private static void stringPermutations(String fullString) {
        System.out.println("Permutation of string: " + fullString);
        stringPermutations("", fullString);
    }

    private static void stringPermutations(String prefix, String remaining) {
        if (remaining.length() == 0) {
            System.out.println(prefix);
        } else {
            for (int i = 0; i < remaining.length(); i++) {
                String prefixString = prefix + remaining.charAt(i);
                /*System.out.println("Prefix String " + prefixString);*/
                String remainingString = remaining.substring(0, i) + remaining.substring(i + 1);
                /*System.out.println("Remaining String " + remainingString);*/
                stringPermutations(prefixString, remainingString);
            }
        }
    }
}
