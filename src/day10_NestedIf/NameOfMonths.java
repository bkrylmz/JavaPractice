package day10_NestedIf;

public class NameOfMonths {
    public static void main(String[] args) {
      int number = 2;
      String name = "";
        if (number == 1) {
            System.out.println(name = "January");
        } else if (number == 2) {
            name = "February";
        }else if (number == 3) {
            name = "March";
        }
        else if (number == 4) {
            name = "April";
        }
        else if (number == 5) {
            name = "May";
        }
        else if (number == 6) {
            name = "June";
        }
        else if (number == 7) {
            name = "July";
        }
        else if (number == 8) {
            name = "Agust";
        }
        else if (number == 9) {
            name = "September";
        }
        else if (number == 10) {
            name = "Oktober";
        }else if (number == 11) {
            name = "November";
        } else {
            name = "December";
        }
        String result = number == 1? "January" :number == 2 ? "February" : (number == 3) ? "March" :
        (number == 4) ? "April" : (number == 5) ? "May" : (number == 6)? "June" : (number == 7) ? "July" :
                (number == 8) ? "Agust" : (number == 9)? "September" : (number == 10)? "October" :
                        (number == 11) ? "November" : "December";
        System.out.println(result);







    }
}
