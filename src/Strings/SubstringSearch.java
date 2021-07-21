package Strings;

import java.util.Scanner;

public class SubstringSearch {
    public static void main(String[] args) {
        String string = "This is sample String";
        System.out.println(string);
        string = string.toUpperCase();
        System.out.println("Enter the string to search");
        Scanner scanner = new Scanner(System.in);
        String searchString = scanner.next();
        searchString = searchString.toUpperCase();

        if (string.contains(searchString)) {
            System.out.println("String found at index: " + string.indexOf(searchString));
        } else {
            System.out.println("String not found");
        }
    }
}
