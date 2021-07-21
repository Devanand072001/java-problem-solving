package Strings;

import java.util.Arrays;
import java.util.Scanner;

public class SortingNames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter no of names: ");
        int nameCount = scanner.nextInt();
        String[] names = new String[nameCount];
        System.out.println("Enter " + nameCount + " names:");
        for (int i = 0; i < nameCount; i++) {
            System.out.print("");
            names[i] = scanner.next();
        }
        System.out.println(Arrays.toString(names));

        for (int i = 0; i < names.length; i++) {
            for (int j = i; j < nameCount; j++) {
                if (names[i].compareTo(names[j]) > 0) {
                    String temp = names[i];
                    names[i] = names[j];
                    names[j] = temp;
                }
            }
        }
        System.out.println("Sorted names: ");
        for (int i = 0; i <nameCount; i++) {
            System.out.println(names[i]);
        }
        System.out.println(Arrays.toString(names));
    }
}
