package tasks;

import java.util.Scanner;

public class GradeLevel {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int age = scan.nextInt();
        String result = "";
        /*
less than 3   -> ineligible
3-4           -> preschool
5             -> kindergarten
6-10          -> elementary school
11-13         -> middle school
14-18         -> high school
19+           -> college
         */
       if (age > 3 || age < 19){
           if ( age <= 4 ){
               result ="ineligible";
           } else if (age == 5 ) {result = "kindergarten";
           } else if (age <= 10) {result = "elementary school";
           } else if (age <= 13) {result = "middle school";
           } else if (age <= 18) {result = "high school";
           } else {result= "college";}
       }else {result= "invalid";}
        System.out.println(result);








    }
}
