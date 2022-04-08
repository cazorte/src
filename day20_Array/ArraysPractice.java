package day20_Array;

import java.util.Arrays;

public class ArraysPractice {
    public static void main(String[] args) {

        int[] numbers = {10,20,50,70};
        System.out.println(numbers);
        System.out.println(Arrays.toString(numbers));
        System.out.println("------------------");

        int[] scores = new int[5];

        System.out.println("-------------");

        char[] letters = new char[27];
        int k=0;
        for (char i = 'A'; i <= 'Z' ; i++) {
            letters[k++]= i;
        }

        System.out.println(Arrays.toString(letters));

    }
}
