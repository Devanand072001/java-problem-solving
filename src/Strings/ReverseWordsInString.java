package Strings;

//Reverse a words in string
public class ReverseWordsInString {
    public static void main(String[] args) {
        String string = "This is a sample string";
        String[] s = string.split(" ");
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = s.length - 1; i >= 0; i--) {
//            System.out.print(s[i]+" ");
            stringBuilder.append(s[i]).append(" ");
        }
        String reversedSentence = stringBuilder.toString();
        System.out.println("Original Sentence: \n\t" + string);
        System.out.println("Reversed Sentence :\n\t" + reversedSentence);
    }
}
