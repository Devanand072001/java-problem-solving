package Strings;

import java.util.*;

public class LetterRepeatedMoreTimes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter string: ");
        String inputString = scanner.nextLine();
        String[] stringArray = inputString.toLowerCase().split("");
        //to store the character and occurrences as key pairs .
        HashMap<String, Integer> hashMap = new HashMap<>();
        //to store the value of key
        ArrayList<Integer> list = new ArrayList<>();

        //stores the string and no of occurrences in hashmap
        for (String string : stringArray) {
            if (!string.equals(" ")) {
                if (hashMap.containsKey(string)) {
                    //replaces and increments the value by 1 if the key exists
                    hashMap.replace(string, hashMap.get(string) + 1);
                } else {
                    //adds key and value to the hashmap
                    hashMap.put(string, 1);
                }
            }
        }
        //store the value of hash map to list
        for (String i : hashMap.keySet()) {
            list.add(hashMap.get(i));
        }

        int maxValue = Collections.max(list);
        String maxKey = null;

        //get the maximum repeating letter by key value
        for (String i : hashMap.keySet()) {
            if (hashMap.get(i).equals(maxValue)) {
                maxKey = i;
            }
        }
        System.out.println("largest repeating letter: " + maxKey + "\ntimes: " + maxValue);
    }
}

