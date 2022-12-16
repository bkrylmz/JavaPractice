package day22_MultiDimensionalArray;

public class IteratingMultiDimensionalArray2 {
    public static void main(String[] args) {
        int [][] arr3D ={{1, 2, 3}, {4, 5, 6, 7, 8}, {9, 10, 11, 12}};


        for (int i = arr3D.length - 1; i >= 0; i--) {
            for (int j = 0; j < arr3D[i].length; j++) {
                System.out.print(arr3D[i][j]+ " ");
            }
            System.out.println();
        }
        System.out.println("----------------------------");

        for (int i = 0 ; i < arr3D.length; i++) {
            for (int j = arr3D[i].length - 1; j >= 0; j--) {
                System.out.print(arr3D[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("------------------------------");


        
        
        
        
        
        
        
        
    }
}
