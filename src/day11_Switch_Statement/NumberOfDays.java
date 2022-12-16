package day11_Switch_Statement;

public class NumberOfDays {
    public static void main(String[] args) {
        int year = 2000;
        int number = 2;
        String result = "";
        switch (number){
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                result = "31 days";
                break;
            case 4: case 6: case 9: case 11:
                result = "30 days";
                break;
            case 2 :
                result = (year %4 == 0)? "29 days" : "28 days";
                break;
            default:
                result = "invalid";


        }
        System.out.println(result);










    }
}
