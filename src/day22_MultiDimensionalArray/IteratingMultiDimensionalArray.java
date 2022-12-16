package day22_MultiDimensionalArray;

import java.util.Arrays;

public class IteratingMultiDimensionalArray {
    public static void main(String[] args) {
        int [][] arr3D ={{1, 2, 3}, {4, 5, 6, 7}, {8, 9, 10, 11, 12}};

        for (int i = 0; i< arr3D.length; i++ ) {//i represents index numbers of single dimensional arrays
            for (int j = 0; j < arr3D[i].length; j++) { //j represents index number of elements

                System.out.print(arr3D[i][j]+ " ");

            }
            System.out.println(); // System.out.println(Arrays.toString(arr3D[i]));
        }

        System.out.println("-----------------------------");















    }
}
