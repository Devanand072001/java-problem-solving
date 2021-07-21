package Strings;

import java.util.Arrays;
import java.util.Scanner;

public class UpperToLowerLowerToUpper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter String: ");
        String string = scanner.nextLine();
        String[] array = string.split("");
        for (int i = 0; i < string.length(); i++) {
            char character = string.charAt(i);
            if (Character.isUpperCase(character)) {
                array[i] = Character.toString(character).toLowerCase();
            }
            if (Character.isLowerCase(character)) {
                array[i] = Character.toString(character).toUpperCase();
            }
        }
        System.out.println(Arrays.toString(array));

        StringBuilder stringBuilder = new StringBuilder();
        for (String s : array) {
            stringBuilder.append(s);
        }
        System.out.println(stringBuilder);
    }
}
