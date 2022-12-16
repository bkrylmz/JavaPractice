package tasks;

public class FrequencyOfJava {
    public static void main(String[] args) {
       /*
       write a program to print true if the string "cat" and "dog" appear
       the same number of times in the given sentence
	        Ex:
	            sentence = "caT dog dogG cAt"
	            output:
	                true
        */
        String str = "caT dog dog cAt cat";
        int countCat = 0;
        int countDog = 0;

        for (int i = 0; i <= str.length()-3; i++) {
            String pet = str.substring(i, i+3);
            if (pet.equalsIgnoreCase("cat")) {
                countCat++;
            }
            if (pet.equalsIgnoreCase("dog")) {
                countDog++;
            }

        }
        if (countDog == countCat) {
            System.out.println("true");
        }else{
            System.out.println("false");
        }










    }
}
