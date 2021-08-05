package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class SquareMatrix {
    public static void main(String[] args) {
        int[][] inputArray = new int[3][3];
        String[] s = new String[3];
        String string = "";
        for (int i = 0; i < 3; i++) {
            string = new Scanner(System.in).nextLine();
            s = string.split(" ");
            inputArray[i] = Arrays.stream(s).mapToInt(Integer::parseInt).toArray();
        }
//        System.out.println(Arrays.deepToString(inputArray));
        int[][] array = new int[][]{{4, 9, 2}, {3, 5, 7}, {8, 1, 5}};
        int[][] matrix = new int[][]{
                {8, 1, 6, 3, 5, 7, 4, 9, 2},
                {6, 1, 8, 7, 5, 3, 2, 9, 4},
                {4, 9, 2, 3, 5, 7, 8, 1, 6},
                {2, 9, 4, 7, 5, 3, 6, 1, 8},
                {8, 3, 4, 1, 5, 9, 6, 7, 2},
                {4, 3, 8, 9, 5, 1, 2, 7, 6},
                {6, 7, 2, 1, 5, 9, 8, 3, 4},
                {2, 7, 6, 9, 5, 1, 4, 3, 8},
        };

//        System.out.println(Arrays.deepToString(array));
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < matrix.length; i++) {
            int total = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                // System.out.print(array[j/3][j%3]+" - "+ matrix[i][j]);
                total +=Math.abs(inputArray[j / 3][j % 3] - matrix[i][j]) ;
            }
            if (total < min){
                min = total;
            }
        }
        System.out.println(min);
    }
}
