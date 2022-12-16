package tasks;

import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int grade = scan.nextInt();
        String result = "";
        /*
> - if the grade is bigger than or equals to `90` output `excellent`
> - if the grade is bigger than or equals to `70` and smaller than `90` output `good`
> - if the grade is bigger than or equals to `60` and smaller than `70` output `pass`
> - if the grade is smaller than `60` output `fail`
         */
        if (grade>=90){
            result = "excellent";} else if (grade>= 70){
            result = "good";} else if (grade >= 60) {result = "pass";
        } else {result = "fail";};
        System.out.println(result);


    }
}
