package day11_Switch_Statement;

public class Grade {
    public static void main(String[] args) {
       char ch = 'B';
       String result = "";
        switch (ch){
            case 'A': case 'B': case 'C': case 'D':
                result = "passed";
                break;
            case 'F':
                result = "failed";
                break ;
            default:
                result = "invalid";
        }
        System.out.println(result);








    }
}
