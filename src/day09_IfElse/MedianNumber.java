package day09_IfElse;

public class MedianNumber {
    public static void main(String[] args) {
        int a = 10,
                b= 20,
                c = 30;
        boolean aIsMedian = b < a && a < c || c < a && a < b;
        boolean bIsMedian = a < b && b < c || c < b && b < a;
        boolean cIsMedian = a < c && c < b || b < c && c < a;
        if(aIsMedian){
            System.out.println(a + " is median number");}
        if(bIsMedian){
            System.out.println(b + " is median number");}
        if(cIsMedian){
            System.out.println(c + " is median number");}



















    }
}
