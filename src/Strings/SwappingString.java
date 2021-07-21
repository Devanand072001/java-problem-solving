package Strings;

public class SwappingString {
    public static void main(String[] args) {
        String string1 = "Devanand";
        String string2 = "V";
        System.out.println("Before swap:\n" + string1 + "\t" + string2);
        string1 = string1.concat(string2);

        System.out.println(string1);
        string2 = string1.substring(0, string1.length() - string2.length());
//        System.out.println(string1.length() - string2.length());
        string1 = string1.substring(string2.length());
//        System.out.println(string2.length());

        System.out.println("After swap:");
        System.out.println(string1 + "\t" + string2);
    }
}
