package day26_CustomMethodsPractice;

import utilities.ArraysUtility;

import java.util.Arrays;

public class MergeArrays {
    public static void main(String[] args) {

        int arr[] = {1,2,3,4,5,6};
        int arr2[] = {5,6,4,7,8,56,87};

        int [] result= ArraysUtility.merge(arr , arr2);
        System.out.println(Arrays.toString(result));

        System.out.println("---------------");

        String[] arr3 = {"I", "love", "Java"};
        String [] arr4 = {"programming", "language"};

        String result1[] = ArraysUtility.merge(arr3, arr4);
        System.out.println(Arrays.toString(result1));





    }

}
