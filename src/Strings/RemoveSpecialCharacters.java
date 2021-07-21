package Strings;
import java.util.*;
public class RemoveSpecialCharacters {
    public static void main(String[] args) {
        System.out.println("Enter String:");
        String string = new Scanner(System.in).next();
        String specialString = string.replaceAll("[a-zA-Z0-9]","");
        string = string.replaceAll("[^a-zA-Z0-9]","");
        System.out.println(specialString);
        System.out.println(string);
    }
}
