package day25_CustomMethods_Overloading;

import utilities.ArraysUtility;

public class Test2 {
    public static void main(String[] args) {

        int [] arr1 = {1,2,3,4,5};
        ArraysUtility.printEach(arr1);
        System.out.println("-------------------");

        int maxNumber = ArraysUtility.max(arr1);
        System.out.println("maxNumber = " + maxNumber);

        System.out.println("-------------------");

        double maxDoubleNumber = ArraysUtility.max(arr1);
        System.out.println("maxDoubleNumber = " + maxDoubleNumber);

        System.out.println("----------------------");

        System.out.println(ArraysUtility.contains(arr1, 5));
    }
}
