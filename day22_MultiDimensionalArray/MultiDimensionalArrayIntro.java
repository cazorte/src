package day22_MultiDimensionalArray;

import java.util.Arrays;

public class MultiDimensionalArrayIntro {

    public static void main(String[] args) {

        int [][] arr2D = { {1,2,3},{4,5,6,7},{8,9,10,11,12},{45,54,65,} };

        int[][] arr = { {1,2,3},{4,5,6,7}};
        System.out.println(Arrays.deepToString(arr));

        arr[1][2] = 5;

        arr2D[3][0]=10;
        System.out.println(Arrays.deepToString(arr2D));
        System.out.println("---------------");

        System.out.println( arr2D[2][1]);


    }
}
