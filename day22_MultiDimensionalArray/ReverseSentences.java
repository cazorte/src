package day22_MultiDimensionalArray;

import java.util.Arrays;

public class ReverseSentences {
    public static void main(String[] args) {

        String sentences = "Today is a good day to learn Java";
        String reversedSentence="";

        String[] words = sentences.split(" ");
        for (int i = words.length - 1; i >= 0; i--) {
            reversedSentence += words[i]+" ";
        }
        System.out.println(reversedSentence);
        System.out.println("----------------------");

        //reversed second words
        String sentence= "I love Java";

        String[] words2 = sentence.split(" ");
        String result = "";
        System.out.println(Arrays.toString(words2));

        for (int i = words2[1].length()-1; i >=0 ; i--) {
            result+= words2[1].charAt(i);

        }

        String result2="";
        words2[1] = result;
        System.out.println(result);
        for (String each : words2) {
            result2 += each+" ";
        }

        System.out.println(result2);

    }
}
