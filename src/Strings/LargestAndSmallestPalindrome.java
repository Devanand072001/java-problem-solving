package Strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class LargestAndSmallestPalindrome {
    public static void main(String[] args) {
        System.out.println("Enter String: ");
        String string = new Scanner(System.in).nextLine();
        string = string.replaceAll(",", "");
        string = string.replaceAll("\\.", "");

        String[] strArray = string.toLowerCase().split(" ");
        System.out.println(Arrays.toString(strArray));
        ArrayList<String> arrayList = new ArrayList<>();

        //check palindrome
        for (String value : strArray) {
            String reverse = "";
            for (int i = value.length() -1; i >=0; i--){
                reverse = reverse + value.charAt(i);
            }
            if (value.equals(reverse.toString())) {
                arrayList.add(value);
            }
        }
        //smallest and largest palindrome
        String small = arrayList.get(0);
        String large = arrayList.get(0);
        for (String word : arrayList) {
            boolean isSmall = small.length() > word.length();
            boolean isLarge = large.length() < word.length();
            if (isSmall) {
                small = word;
            }
            if (isLarge) {
                large = word;
            }
        }
        System.out.println("smallest palindrome: " + small);
        System.out.println("largest palindrome: " + large);
    }
}
