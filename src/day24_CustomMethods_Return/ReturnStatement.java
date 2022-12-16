package day24_CustomMethods_Return;

public class ReturnStatement {
    public static void main(String[] args) {
        nameOfDay(5);





    }
    public static void nameOfDay (int number){
        if(number< 1 || number > 7){
            System.out.println("invalid");
            return;//exits nameOfday method
        }
        String result = "";
        if (number == 1) {
            result = "Monday";
        } else if (number == 2) {
            result = "Tuesday";
        }else if (number == 3) {
            result = "Wednesday";
        }else if (number == 4) {
            result = "Thursday";
        }else if (number == 5) {
            result = "Friday";
        }else if (number == 6) {
            result = "Saturday";
        }else {
            result = "Sunday";
        }
        System.out.println(result);
    }






}
