package day17_While_DoWhile;

public class FrequencyOfCharacter {

    public static void main(String[] args) {

        String str ="AAAABBBCCDD";

        char ch ='A';

        int frequency=0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i)==ch){
                frequency++;
            }
        }
        System.out.println(frequency);

    }
}
