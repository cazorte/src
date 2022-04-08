package day21_ForEachLoop;

import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {

        String str = "Java";

        char[] b = str.toCharArray();

        System.out.println(Arrays.toString(b));
        for (char each : b) {
            System.out.println(each);
        }

        System.out.println(Arrays.toString(str.toCharArray()));
        System.out.println("-------------");

        String sentence = "I love Java and Python.";

        String a[] = sentence.split(" ");
        System.out.println(Arrays.toString(a));

        System.out.println("------------");

        int[] numbers = {10, 21, 250, 30, 20, 50, 40, 1};
        int[] reversed = new int[numbers.length];

        for (int i = reversed.length - 1; i >= 0; i--) {
            reversed[i] = numbers[numbers.length - 1 - i];
        }
        System.out.println(Arrays.toString(reversed));
        System.out.println("------------------");


    }
}
