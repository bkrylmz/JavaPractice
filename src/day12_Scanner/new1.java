package day12_Scanner;

import java.util.Locale;
import java.util.Scanner;

public class new1 {
    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);
        System.out.println("enter the radius of the circle");


        double r = input.nextDouble();
        double area = 3.14 * r * r;
        double perimeter = 2 * 3.14 *r;
        System.out.println("perimeter = " + perimeter);
        System.out.println("area = " + area);


    }
}
