package Strings.FrequencyCount;

import java.util.*;

public class FrequencyCount {
    //count the occurrence of each String.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter String: ");
        String inputString = scanner.nextLine();
        inputString = inputString.toLowerCase();
        String[] array = inputString.split("");
        HashMap<String, Integer> hashMap = new HashMap<>();

       /* for (int i = 0; i < array.length; i++) {
            if (hashMap.containsKey(array[i])){
                hashMap.put(array[i], hashMap.get(array[i])+1);
            }else {
                hashMap.put(array[i],1);
            }
        }*/
        for (String s : array) {
            if (!s.equals(" ")) {
                if (hashMap.containsKey(s)) {
                    hashMap.replace(s, hashMap.get(s) + 1);
                } else {
                    hashMap.put(s, 1);
                }
            }
        }
        System.out.println("String\tFrequency");
        for (String i : hashMap.keySet()) {
            System.out.println(i + "\t\t" + hashMap.get(i));
        }

    }
}
