package tasks.day24;

public class FrequencyOfWord {

    public static int frequencyOfWord(String sentence, String word){
        int count = 0;
        while (sentence.contains(word))
        {
            sentence = sentence.replaceFirst(word, "");
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        int num = frequencyOfWord("Java is a beautiful proggramming language. Learning Java is cool.", "Java");

        System.out.println(num);
    }



}
/*
 create a method named frequencyOfWord that passes two parameters:
 string sentence and String word, then returns the frequency of word from the sentence
                Ex:
                    sentence = "Java java java python python"
                    word = "java";
                    frequencyOfWord(sentence, word) ==>  3
 */
