package day27_WrapperClasses;

import java.util.Arrays;

public class ReplaceAll {
    public static void main(String[] args) {
        int[] arr ={1,2,4,5,6,3,5,5,5,5,6,3,2,4,};
        arr = replaceAll(arr, 5, 30);
        System.out.println(Arrays.toString(arr));
    }
    //replaces all the matching old value of the array with the new value
    public static int[] replaceAll(int[] arr, int oldValue, int newValue){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == oldValue){
                arr[i] = newValue;
            }
        }
        return arr;

    }
    public static char[] replaceAll(char[] arr, char oldValue, char newValue){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == oldValue){
                arr[i] = newValue;
            }
        }
        return arr;

    }
    public static double[] replaceAll(double[] arr, double oldValue, double newValue){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == oldValue){
                arr[i] = newValue;
            }
        }
        return arr;

    }
    public static String[] replaceAll(String[] arr, String oldValue, String newValue){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(oldValue)){
                arr[i] = newValue;
            }
        }
        return arr;

    }






}
