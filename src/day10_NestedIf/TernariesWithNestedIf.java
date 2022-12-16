package day10_NestedIf;

public class TernariesWithNestedIf {
    public static void main(String[] args) {

        int s = 85;

        if(s >= 0 && s <= 100){
            if(s >= 60) {System.out.println("Passed");}
            else {
                System.out.println("Failed");
            }

        } else {
            System.out.println("Invalid score");
        }
       String result = (s>= 0 && s<= 100)? (s>= 60)? "Passed": "Failed" : "invalid score";
        System.out.println(result);
        System.out.println("-----------------------------");
        int score = 85;
        String result1 = "";
        if (score >= 0 && score <=100) {
            if (score >= 90) {
                result1 = "Excelent";
            } else if (score >= 80) {
                result1 = "Great";
            }   else if (score >= 70) {
                result1 = "Good";
            }else if (score >= 60) {
                result1 = "Passed";}
            else {
                result1 = "Failed";}
        }

        else {
            result1 = "Invalid score";
        }
        String result2 = (score >= 0 && score <=100) ? (score >= 90) ? "Excelent" : (score >= 80) ? "Great":
        (score >= 70) ? "Good": (score >= 60) ? "Passed" : "Failed" : "Invalid score";
        System.out.println(result2);
        System.out.println("-------------------------------------------");








    }
}
