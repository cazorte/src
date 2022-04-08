package day17_While_DoWhile;

public class FrequencyWord {
    public static void main(String[] args) {

        String word = "XXXXXXasdXXXXXerCXXXXXXatCatCXXXXataXXXXXsdekfj";

        String searchItem="XXX";
        int counter=0;
        for (int i = 0; i < word.length()-2; i++) {
            if (word.substring(i,i+3).equals(searchItem)){
                counter++;
                i+=2;           //indepenence XXX
            }
        }
        System.out.println(counter);


    }



}
