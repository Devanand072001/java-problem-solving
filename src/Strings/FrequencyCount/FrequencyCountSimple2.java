package Strings.FrequencyCount;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class FrequencyCountSimple2 {
    public static void main(String[] args) {
        System.out.println("Enter String: ");
        String string = new Scanner(System.in).nextLine();

        char[] charArray = string.toCharArray();
//        System.out.println('b' - 'a');// 1
//        System.out.println('z' - 'a');// 25

        int[] frequency = new int[26];
        HashMap<Character, Integer> hashMap = new HashMap<>();
        /*--------main code----------------*/
        for (char i: charArray){
            frequency[i - 'a']++;
//            System.out.println(i+" "+frequency[i - 'a']);
            if (hashMap.containsKey(i)){
                hashMap.replace(i,frequency[i-'a']);
            }else {
                hashMap.putIfAbsent(i,frequency[i - 'a']);
            }
        }
        /*----------main code--------------*/
        System.out.println("hash map: "+hashMap);
        System.out.println(Arrays.toString(frequency));

    }
}
