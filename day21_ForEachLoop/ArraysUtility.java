package day21_ForEachLoop;

import java.util.Arrays;

public class ArraysUtility {
    public static void main(String[] args) {
        int [] nums = {1,2,3,4,50};
        System.out.println(nums.toString());
        System.out.println(Arrays.toString(nums));

        int sum=0;
        for (int each : nums) {
            sum += each;
        }
        System.out.println("sum = " + sum);

        System.out.println("-----------------------");


    }



}
