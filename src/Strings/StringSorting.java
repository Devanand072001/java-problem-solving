package Strings;


import java.util.Arrays;
import java.util.Scanner;

public class StringSorting {
    public static void main(String[] args) {
        Scanner stringScanner = new Scanner(System.in);
        String inputString = stringScanner.nextLine();
//        inputString= inputString.toLowerCase();
        String[] strings = inputString.split("");
//        for (String s : strings) {
//            System.out.print(s);
//        }
//        System.out.println(Arrays.toString(strings));
        Arrays.sort(strings);
        System.out.println(Arrays.toString(strings));
        System.out.println("Sorted string");
        for (String string : strings) {
            System.out.print(string);
        }
    }
}



