package day12_Scanner;

import java.util.SortedMap;

public class GradeLevel {
    public static void main(String[] args) {
        int num= 8;
        if (num>0 && num<19) {
            if (num <= 5) {
                System.out.println("Elementary School");
            } else if (num <= 8) {
                System.out.println("Middle School");
            } else if (num <= 12) {
                System.out.println("High School");
            } else if (num <= 16) {
                System.out.println("College");
            } else if (num <= 18) {
                System.out.println("Grad School");
            }
        }else {
            System.out.println("invalid");
        }

        System.out.println("-------------------------");
        int num2= 15;
        switch (num2){
            case 1: case 2: case 3: case 4: case 5:
                System.out.println("Elementary School");
                break;
            case 6: case 7: case 8:
                System.out.println("Middle School");
                break;
            case 9: case 10: case 11: case 12:
                System.out.println("High School");
                break;
            case 13: case 14: case 15: case 16:
                System.out.println("College");
                break;
            case 17: case 18:
                System.out.println("Grad School");
                break;
            default:
                System.out.println("Invalid");


        }









    }
}
