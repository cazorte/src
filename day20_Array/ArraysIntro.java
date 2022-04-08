package day20_Array;

import java.util.Arrays;

public class ArraysIntro {
    public static void main(String[] args) {

        //create a variable that's capable enough to contain 5 names

        String[] myGroup = new String[5];

        myGroup[0] = "Ahmet";
        myGroup[1] = "Abo";
        myGroup[2] = "Wine";
        myGroup[3] = "Emy";
        myGroup[3] += "Burak";

        System.out.println(myGroup); //hashcode
        System.out.println(Arrays.toString(myGroup));
        System.out.println("----------------------------------");

        String[] days = {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};

        System.out.println(Arrays.toString(days));


    }
}
