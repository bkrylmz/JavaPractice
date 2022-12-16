package bekir;

import java.util.Scanner;

public class deneme3 {
    public static void main(String[] args) {

        String[] words = {"Java", "Java", "C#", "Python", "Python"};
        String elements= words[0];
        int frequency =0;
        for (int i = 0; i < words.length; i++) {
            if(words[i].equals(elements)){
                frequency++;

            }
if (frequency==1){
    System.out.println("elements = " + elements);
}

        }



    }
}
