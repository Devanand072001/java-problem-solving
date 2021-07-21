package Strings;

public class RemoveCommonChars {
    public static void main(String[] args) {
        String sentence = "This is a sample sentence";
        String[] array = sentence.split("");
        StringBuilder commonChars = new StringBuilder();
        System.out.println("The original sentence:\n"+sentence);
        //to find the common characters.
        for (char start = 'a'; start <= 'z'; start++) {
            int count = 0;
            for (int i = 0; i < sentence.length(); i++) {
                if (start == sentence.charAt(i)) {
                    count++;
                }
            }
            if (count > 1) {
                commonChars.append(start);
            }
        }
        System.out.println("Common chars: "+commonChars);
        //array of common characters.
        String[] commonCharArr = commonChars.toString().split("");
        //removing common character from the sentence.
        for (String s : array) {
            for (String value : commonCharArr) {
                if (s.contains(value)) {
                    sentence = sentence.replace(value, "");
                }
            }
        }
        System.out.println("Removed sentence:\n"+sentence);
    }
}
