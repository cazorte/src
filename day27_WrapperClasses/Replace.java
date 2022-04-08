package day27_WrapperClasses;

import java.util.Arrays;

public class Replace {

    public static void main(String[] args) {
        int arr[] = {1,5,4,6,8,2};
        arr =replace(arr,3,100);
        System.out.println(Arrays.toString(arr));
        System.out.println("----------------");

        double arr2[] = {1.2,5,4,6.5,8,2};
        arr2 = replace(arr2,5,10.4);
        System.out.println(Arrays.toString(arr2));

    }
    //replace the element of the array at given index with the new element
    public static int[] replace(int[] array, int index, int newElement){
        if (index<0 || index> array.length-1){
            System.err.println("Invalid index: "+index);
            System.exit(0);
        }
        array[index] = newElement;
        return array;
    }
    public static double[] replace(double[] array, int index, double newElement){
        if (index<0 || index> array.length-1){
            System.err.println("Invalid index: "+index);
            System.exit(0);
        }
        array[index] = newElement;
        return array;
    }
    public static char[] replace(char[] array, int index, char newElement){
        if (index<0 || index> array.length-1){
            System.err.println("Invalid index: "+index);
            System.exit(0);
        }
        array[index] = newElement;
        return array;
    }
    public static String[] replace(String[] array, int index, String newElement){
        if (index<0 || index> array.length-1){
            System.err.println("Invalid index: "+index);
            System.exit(0);
        }
        array[index] = newElement;
        return array;
    }




}
