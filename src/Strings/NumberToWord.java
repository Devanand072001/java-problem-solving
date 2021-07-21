package Strings;

import java.util.Scanner;

public class NumberToWord {

    public void numberToWord(int inputNumber, String ch) {
        /*System.out.println("input number: " + inputNumber);
        System.out.println("ch" + ch);*/
        String[] one = {" ", " one", " two", " three", " four", " five", " six", " seven", " eight", " Nine", " ten", " eleven", " twelve", " thirteen", " fourteen", "fifteen", " sixteen", " seventeen", " eighteen", " nineteen"
        };
        String[] ten = {" ", " ", " twenty", " thirty", " forty", " fifty", " sixty", "seventy", " eighty", " ninety"};
        if (inputNumber > 19) {
            System.out.print(ten[inputNumber / 10] + " " + one[inputNumber % 10]);
            /*System.out.println("\nten[n/10]: " + ten[inputNumber / 10]);
            System.out.println("one[n % 10]: " + one[inputNumber % 10]);*/
        } else {
            System.out.print(one[inputNumber]);

        }
        if (inputNumber > 0) {
            System.out.print(ch);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer number: ");
        int inputNumber = scanner.nextInt();
        if (inputNumber <= 0) {
            System.out.print("Enter numbers greater than 0");
        } else {
            NumberToWord a = new NumberToWord();
            System.out.print("After conversion number in words is :");
            a.numberToWord(inputNumber / 1000000000, " Hundred");
            a.numberToWord((inputNumber / 10000000) % 100, " crore");
            a.numberToWord((inputNumber / 100000) % 100, " lakh");
            a.numberToWord((inputNumber / 1000) % 100, " thousand");
            a.numberToWord((inputNumber / 100) % 10, " hundred");
            a.numberToWord(inputNumber % 100, " ");
        }
    }
}
