package day17_While_DoWhile;

public class FrequencyOfWord2 {
    public static void main(String[] args) {
        String str = "Java Java Python Python";
        int frequency = 0;
        while (str.contains("Java")){
            str = str.replaceFirst("Java", "");
            frequency++;
        }
        System.out.println("frequency = " + frequency);
        System.out.println("------------------------------");
        String sentence = "cat cat cat cat dog dog";
        int frequency2 = 0;
        while (sentence.contains("cat")){sentence = sentence.replaceFirst("cat", "");
            frequency2++;
        }
        System.out.println("frequency2 = " + frequency2);
        System.out.println("---------------------------------");
        String s = "java java java python";
        int countJava = 0;
        int countPython = 0;
        while (s.contains("java")|| s.contains("python")){
            if(s.contains("java")){
                s = s.replaceFirst("java","");
                countJava++;
            }
            if (s.contains("python")){
                s = s.replaceFirst("python", "");
                countPython++;
            }

        }
        System.out.println("countJava = " + countJava);
        System.out.println("countPython = " + countPython);







    }
}
