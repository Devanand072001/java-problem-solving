package Strings.FrequencyCount;


import java.util.Scanner;

public class FrequencyCount1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter string");
        String string = scanner.nextLine();
        string = string.toLowerCase();
        System.out.println("String\tFrequency");

        for (char start = 'a'; start <= 'z'; start++) {
            int count = 0;// must initialised within this loop.

            for (int i = 0; i < string.length(); i++) {
                if (start == string.charAt(i)) {
                    count++;
                }
            }

            if (count > 0) {
                System.out.println(start + "\t\t" + count);
            }
        }
    }
}
