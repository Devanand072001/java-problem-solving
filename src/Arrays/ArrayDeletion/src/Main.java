package Arrays.ArrayDeletion.src;

import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

// Delete a specific element in an array;
public class Main {
    public static void main(String[] args) {
        int[] array = randomArray(6);
        System.out.println(Arrays.toString(array));
        int element = getElement();
        deleteElement(array, element);
    }

    private static void deleteElement(int[] array, int element) {
        int elementCount = elementCount(array, element);
        //create new array of size = ( length of actual array - no of times the element exists in the array);
        int[] newArray = new int[array.length - elementCount];

        for (int i = 0, k = 0; i < array.length; i++) {

            // check if index is crossed, continue without copying
            if (array[i] == element) {
                continue;
            }
            // else copy the element
            newArray[k++] = array[i];
        }
        System.out.println("Array after deleting " + element);
        System.out.println(Arrays.toString(newArray));
    }

    // counts the no of times the element exists in the array.
    private static int elementCount(int[] array, int element) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == element) {
                count++;
            }
        }
        return count;
    }

    private static int getElement() {
        System.out.println("Enter element to be deleted: ");
        return new Scanner(System.in).nextInt();
    }

    //generate random array
    public static int[] randomArray(int size) {
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = new Random().nextInt(10);
        }
        return array;
    }
}
