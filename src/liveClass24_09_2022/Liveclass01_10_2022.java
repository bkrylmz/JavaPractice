package liveClass24_09_2022;

public class Liveclass01_10_2022 {
    public static void main(String[] args) {

        int n = 6;
       String result = "";

        if(n%2==0){
            result = "by2";
        }else if(n%3==0){
            result += "by3";
        }else{
            result = "non of them";
        }
        System.out.println(result);
    }
}
