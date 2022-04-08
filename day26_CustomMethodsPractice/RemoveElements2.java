package day26_CustomMethodsPractice;

import utilities.ArraysUtility;

import java.util.Arrays;

public class RemoveElements2 {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 5, 45};

        char[] arrayChar = {'A','B','C'};
        arrayChar = removeElement(arrayChar, 2);
        System.out.println(Arrays.toString(arrayChar));



    }

    public static int[] removeElement(int[] array, int index){

        if(index < 0 || index > array.length-1){
            System.err.println("Invalid Index Number: "+index);
            System.exit(0);
        }

        int[] result = {};

        for (int i = 0; i < array.length; i++) {// i: array's index number
            if(i != index){
                result = ArraysUtility.addElement(result, array[i]);
            }
        }

        return result;
    }
    public static double[] removeElement(double[] array, int index){

        if(index < 0 || index > array.length-1){
            System.err.println("Invalid Index Number: "+index);
            System.exit(0);
        }

        double[] result = {};

        for (int i = 0; i < array.length; i++) {// i: array's index number
            if(i != index){
                result = ArraysUtility.addElement(result, array[i]);
            }
        }

        return result;
    }
    public static char[] removeElement(char[] array, int index){

        if(index < 0 || index > array.length-1){
            System.err.println("Invalid Index Number: "+index);
            System.exit(0);
        }

        char[] result = {};

        for (int i = 0; i < array.length; i++) {// i: array's index number
            if(i != index){
                result = ArraysUtility.addElement(result, array[i]);
            }
        }

        return result;
    }
    public static String[] removeElement(String[] array, int index){

        if(index < 0 || index > array.length-1){
            System.err.println("Invalid Index Number: "+index);
            System.exit(0);
        }

        String[] result = new String[array.length-1];

        for (int i = 0; i < array.length; i++) {// i: array's index number
            if(i != index){
                result = ArraysUtility.addElement(result, array[i]);
            }
        }

        return result;
    }



}

