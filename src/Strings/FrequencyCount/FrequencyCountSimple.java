package Strings.FrequencyCount;

import java.util.*;
public class FrequencyCountSimple {
    public static void main(String[] args) {
        System.out.println("Enter String: ");
        String string = new Scanner(System.in).nextLine();

        char[] charArray = string.toCharArray();
//        System.out.println('b' - 'a');// 1
//        System.out.println('z' - 'a');// 25

        int[] frequency = new int[26];

        /*--------main code----------------*/
        for (char i: charArray){
            frequency[i - 'a']++;
        }
        /*----------main code--------------*/

        System.out.println(Arrays.toString(frequency));
        //display frequency
        char[] alpha = new char[26];
        int a = 0;
        for (char i = 'a' ; i<='z'; i++){
            alpha[a] = i;
            a++;
        }
        System.out.println(Arrays.toString(alpha));
        for (int i = 0; i < 26;i++) {
            if (frequency[i] > 0){
                System.out.println(alpha[i] +"\t"+frequency[i]);
            }
        }

    }
}
