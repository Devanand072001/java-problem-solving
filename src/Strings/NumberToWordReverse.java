package Strings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class NumberToWordReverse {
    public static void main(String[] args) {
        HashMap<String, String> numbers = new HashMap<>();
        numbers.put("1", " one");
        numbers.put("2", " two");
        numbers.put("3", " tree");
        numbers.put("4", " four");
        numbers.put("5", " five");
        numbers.put("6", " six");
        numbers.put("7", " seven");
        numbers.put("8", " eight");
        numbers.put("9", " nine");
        numbers.put("10", " ten");
//        for (String number: numbers.keySet()){
//            System.out.println(number+"\t"+numbers.get(number));
//        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number: ");
        int num = scanner.nextInt();
        String numSting = Integer.toString(num);
        String[] numArray = numSting.split("");
        ArrayList<Object> list = new ArrayList<>();
        for (String number : numbers.keySet()) {
            for (String s : numArray) {
                if (numbers.containsKey(s)) {
                    list.add(numbers.get(s));
                }
            }
            break;
        }
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.print(list.get(i));
        }
    }
}
