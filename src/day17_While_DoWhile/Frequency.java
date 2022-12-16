package day17_While_DoWhile;

public class Frequency {
    public static void main(String[] args) {
        String str = "AAABBAAAAAAAAAABBBBBBBBCCCCCCCCCC";
        char ch = 'B';
        int frequency = 0;
        for (int i = 0; i < str.length(); i++) {
            char eachchar = str.charAt(i);
            if(ch == eachchar){
                frequency++;
            }




        }
        System.out.println("A frequency = " + frequency);












    }
}
