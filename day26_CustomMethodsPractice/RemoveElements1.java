package day26_CustomMethodsPractice;

import java.util.Arrays;

public class RemoveElements1 {

    public static void main(String[] args) {
        int [] array = {1,2,3,4,5,6,7,8,5,45};
        int [] asd = removeElement(array, 4);
        System.out.println(Arrays.toString(asd));
    }

    public static int[] removeElement(int[] array, int index){

        if (index<0 || index> array.length){
            System.err.println("Invalid Index: "+index);
            System.exit(0);
        }

        int[] result = new int[array.length-1];

        int j=0;
        for (int i=0; i < array.length; i++) {
            if (i == index){
                continue;
            }
            result[j++] =+ array[i];
        }

        return result;
    }

}
