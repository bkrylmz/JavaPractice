package day10_NestedIf;

public class GradeReport {
    public static void main(String[] args) {
        int score = 85;
        String result = "";
        if (score >= 0 && score <=100) {
            if (score >= 90) {
                result = "Excelent";
            } else if (score >= 80) {
                result = "Great";
            }   else if (score >= 70) {
                result = "Good";
            }else if (score >= 60) {
                result = "Passed";}
                else {
                    result = "Failed";}
    }

        else {
            result = "Invalid score";
        }
        System.out.println(result);
        System.out.println("--------------------------------------");










    }
}
