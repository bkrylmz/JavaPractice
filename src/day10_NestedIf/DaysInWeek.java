package day10_NestedIf;

public class DaysInWeek {
    public static void main(String[] args) {
        int num = 7;
        if(num==1){
            System.out.println("Monday");} else if (num==2) {
            System.out.println("Tuesday");} else if (num==3) {
            System.out.println("Wednesday");} else if (num==4) {
            System.out.println("Thursday");} else if (num==5) {
            System.out.println("Friday");} else if (num==6) {
            System.out.println("Saturday");}else {
            System.out.println("Sunday");}
        System.out.println("-----------------------------------");
        String result = (num==1)? "Monday" : (num==2) ? "Tuesday" : (num==3) ?
                "Wednesday" : (num==4) ? "Thursday" : (num==5)? "Friday" : (num==6) ?
                "Saturday" : "Sunday";
        System.out.println(result);







    }
}
