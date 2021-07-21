package Strings;

public class CostumSorting {
    public static void main(String[] args) {
        String order = "cba";
        String str = "abbcdc";
        System.out.println(costumSort(order, str));
    }

    private static String costumSort(String order, String str) {
        StringBuilder solution = new StringBuilder();
        //count the frequency of characters in str
        int[] frequency = new int[26];
        for (char c : str.toCharArray()) {
            frequency[c - 'a']++;
        }
        //add the characters with frequency in solution.
        for (char c : order.toCharArray()) {
            for (int i = 0; i < frequency[c - 'a']; i++) {
                solution.append(c);
            }
            frequency[c - 'a'] = 0; //to start from first index.
        }
        // add remaining characters from string and not in order.
        for (char c = 'a'; c <= 'z'; c++) {
            for (int j = 0; j < frequency[c - 'a']; j++) {
                solution.append(c);
            }
        }
        return solution.toString();
    }
}
