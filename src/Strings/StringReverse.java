package Strings;

import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args) {
        Scanner reverseScanner = new Scanner(System.in);
        System.out.println("Enter String to reverse: ");
        String string = reverseScanner.nextLine();
        //using string builder
        StringBuilder stringBuilder = new StringBuilder(string);
        StringBuilder reversedString = stringBuilder.reverse();
        System.out.println(reversedString);
        if (reversedString.toString().equals(string)) {
            System.out.println("palindrome");
        }

        //using string buffer
        StringBuffer stringBuffer = new StringBuffer(string);
        StringBuffer reversedBuffer = stringBuffer.reverse();
        System.out.println(reversedBuffer);
    }
}
