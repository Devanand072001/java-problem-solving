import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Deletion {
    //deletion at specific position
    public static void main(String[] args) {
        int[] array = randomArray(6);
        System.out.println(Arrays.toString(array));
        //position = index -1;
        int position = getPosition() - 1;
        deleteElement(array, position);
    }

    private static void deleteElement(int[] array, int position) {
        int[] newArray = new int[array.length - 1];
        for (int i = 0, k = 0; i < array.length; i++) {
            if (i == position) {
                continue;
            }
            newArray[k++] = array[i];
        }
        System.out.println("After deletion of element at position: " + position);
        System.out.println(Arrays.toString(newArray));
    }

    private static int getPosition() {
        System.out.println("Enter position to be deleted: ");
        return new Scanner(System.in).nextInt();
    }

    public static int[] randomArray(int size) {
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = new Random().nextInt(10);
        }
        return array;
    }
}
