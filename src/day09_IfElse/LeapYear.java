package day09_IfElse;

public class LeapYear {
    public static void main(String[] args) {
        int year = 2022;
        boolean isLeapYear = year % 4 == 0;
        if (isLeapYear){
            System.out.println("Year "+ year+ " is a leap year.");
        }
        if (!isLeapYear) {
            System.out.println("Year "+ year + " is not leap year.");
        }
        System.out.println("---------------------------------------");
        if (isLeapYear){
            System.out.println("Year " + year + " is leap year.");
        } else {
            System.out.println( "Year " + year + " is not leap year.");
        }








    }
}
