package day27_WrapperClasses;

import utilities.ArraysUtility;

import java.util.Arrays;

public class RemoveDuplicates {

    public static void main(String[] args) {
        int[] arr = {1,2,4,5,5,6,4,1,8,2,2,4,1,2,5,5,6};
        arr = removeDuplicates(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println("------------");

        String [] arr2 = {"ali", "veli","49", "50", "veli", "veli"};
        arr2 = removeDuplicates(arr2);
        System.out.println(Arrays.toString(arr2));

    }


    public static int[] removeDuplicates(int[] array){
        int[] result = {};
        for (int each : array) {
            if (!ArraysUtility.contains(result,each)){
                result = ArraysUtility.addElement(result,each);
            }
        }
        return result;
    }
    public static double[] removeDuplicates(double[] array){
        double[] result = {};
        for (double each : array) {
            if (!ArraysUtility.contains(result,each)){
                result = ArraysUtility.addElement(result,each);
            }
        }
        return result;
    }
    public static char[] removeDuplicates(char[] array){
        char[] result = {};
        for (char each : array) {
            if (!ArraysUtility.contains(result,each)){
                result = ArraysUtility.addElement(result,each);
            }
        }
        return result;
    }
    public static String[] removeDuplicates(String[] array){
        String[] result = {};
        for (String each : array) {
            if (!ArraysUtility.contains(result,each)){
                result = ArraysUtility.addElement(result,each);
            }
        }
        return result;
    }




}
