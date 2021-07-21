package Strings;

import java.util.Scanner;

public class SmallestAndLargestWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter sentence: ");
        String sentence = scanner.nextLine();
        String[] words = sentence.split(" ");
        String small = words[0];
        String large = words[0];
        for (String word : words) {
            boolean isSmall = small.length() > word.length();
            boolean isLarge = large.length() < word.length();
            if (isSmall) {
                small = word;
            }
            if (isLarge) {
                large = word;
            }
        }
        System.out.println("Smallest " + small);
        System.out.println("Largest " + large);
    }
}
