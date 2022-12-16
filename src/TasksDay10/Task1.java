package TasksDay10;

public class Task1 {
    public static void main(String[] args) {

        byte n = 21;
        String result = "";
        if(n>=1 && n<=5){
            result="Elementary school ";
        }else if(n>=6 && n<=8){
            result="Middle school";
        }else if(n>=9 && n<=12){
            result="High school";
        }else if(n>=13 && n<=16) {
            result = "Collage";
        }else if(n>=17 && n<=18) {
            result = "Grad School";
        }else{
            result= "Invalid grade level given";
        }
        System.out.println(result);
//1. Create a class called GradeLevel, Given a number(byte)
// grade level determine and print which school type someone is in.
//            grade level and types are:
//                    1-5: Elementary school
//                    6-8: Middle school
//                    9-12: High school
//                    13-16: College
//                    17-18: Grad School
//
//                    For Any Other grade: Invalid grade level given
//
//            NOTE: MUST USE NESTED IF. DO NOT USE MORE THAN ONE PRINT STATEMENT


    }
}
