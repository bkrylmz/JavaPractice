package tasks;

public class AgeGroups {
    public static void main(String[] args) {
        /*
        Create a class called AgeGroups, and write a program that can define
the age groups of a person
             age groups are:
                    infant (1 - 2)
                    Toddler (3 - 5),
                    Kid (6 - 9),
                    Pre-Teen (10 - 12),
                    Teenager (13 - 17),
                    Young Adult (18 - 20),
                    Adult (21 - 39),
                    Young Middle-Aged Adult
(40 - 49),
                    Middle-Aged Adult (50 -
54),
                    Very Young Senior Citizen
(55 - 64),
                    Young Senior Citizen (65
- 74),
                    Senior Citizen (75 - 84),
                    Old Senior Citizen (85+)
         */
        int number = 39;
        String result = "";
        if (number>=1 && number <= 2){
            result = "infant";
        } else if (number <=5) {
            result = "Toddler";
        } else if (number<=9) {
            result = "Kid";
        } else if (number <= 12) {
            result = "Pre-teen";
        } else if (number<= 17) {
            result = "Teenager";
        } else if (number<= 20) {
            result = "Young adult";
        } else if (number<= 39) {
            result = "Adult";
        } else if (number <= 49) {
            result = "Young Middle-Aged Adult";
        } else if (number<= 54) {
            result = "Middle-Aged Adult";
        } else if (number<= 64) {
            result = "Very Young Senior Citizen";
        } else if (number <= 74) {
            result = "Young Senior Citizen";
        } else if (number<= 84) {
            result = "Senior Citizen";
        }else {result= "Old Senior Citizen";}
        System.out.println(result);
























    }
}
