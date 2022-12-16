package home_Work;

import java.util.Arrays;

public class data1 {
    public static void main(String[] args) {

        // 10 20 50 70

        int[] elements = {10,20,50,70};
        System.out.println(Arrays.toString(elements));

        System.out.println("---");


        int[] elements2= new int[6];
        elements2[0]= 11;
        elements2[1]= 22;
        elements2[2]= 33;
        elements2[3]= 44;
        elements2[4]= 55;
        elements2[5]= 66;
        System.out.println(elements2[0]);


        System.out.println("----");

        String[] months = {"jan", "feb", "mar", "apr", "may", "jun", "july",
        "aug","sep","oct", "nov", "dec"};
        System.out.println(months[months.length-1]);



    }
}
