package day13_StringClass;

public class StringMethods {
    public static void main(String[] args) {
        String word = "Cydeo";
        char thirdChar = word.charAt(2);
        System.out.println("thirdChar = " + thirdChar);
        char tenthChar = word.charAt(4);
        System.out.println("tenthChar = " + tenthChar);
        System.out.println("--------------------------");
        String s1 = "Batch 25 is the best batch. Java Programming Language";
        int totalChar = s1.length();
        System.out.println("totalChar = " + totalChar);
        System.out.println("--------------------------");
        char lastChar = s1.charAt(s1.length()-1);
        System.out.println("lastChar = " + lastChar);
        System.out.println("--------------------------");
        String str = "wooden spoon";
        str = str.toUpperCase();
        System.out.println("str = " + str);
        
        String s = "JAVA";
        s = s.toLowerCase();
        System.out.println("s = " + s);

        String sentence = "Today is a great day to learn java programming language.";
        sentence = sentence.toUpperCase();
        System.out.println("sentence = " + sentence);
        
        




    }
}
