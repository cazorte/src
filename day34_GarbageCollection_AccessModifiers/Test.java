package day34_GarbageCollection_AccessModifiers;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

import static day34_GarbageCollection_AccessModifiers.Circle.*;
import static utilities.MathUtility.*;

public class Test {

    public static void main(String[] args) {

        System.out.println(pi);
        System.out.println(name);
        System.out.println(numbers);

        System.out.println("----------------------------");

        // find the sum of 10, 20
        int r1 = sum(10, 20);

        // find the sum of 100, 200
        int r2 = sum(100, 200);


        int r3 = subtract(100,50);

        int r4 = max(1000, 2000);
        System.out.println("--------------------");

        int[] intArr = {1,2,3};
        ArrayList<Integer> intList = new ArrayList<>(Arrays.asList());
        ArrayList<Integer> intList2 = new ArrayList<>();


        String str=" ";

        System.out.println(str.isBlank() );
        System.out.println(str.isEmpty() );
        System.out.println("------------------");

        System.out.println(intList.isEmpty());
        System.out.println(intList2.isEmpty());

        System.out.println("-----------------------------");

        int[] intArr2 = {4,5,6};
        String[] strList2 ={"a","b","c"};
   //   ArrayList<Integer> intList3 = new ArrayList<>(Arrays.asList(intArr2)); //Array list dont give primitive arr
        ArrayList<String> strList = new ArrayList<>(Arrays.asList(strList2));

        Integer[] intArrWrapper = {4,5,6,7};
        ArrayList<Integer> intListWithWrapper = new ArrayList<>(Arrays.asList(intArrWrapper));

        intListWithWrapper.add(8);

        ArrayList<Integer> intList1 = new ArrayList<>(Arrays.asList(1,2,3,3,4));
        intList1.add(5);
        intList1.addAll(Arrays.asList(6,7,88));
        System.out.println(intList1);

        System.out.println("-----------------------");

        ArrayList<String> nameList = new ArrayList<>(Arrays.asList("Ayşe", "ayşe", "Fatma", "Ayten", "Anıl"));
        Collections.sort(nameList);
        System.out.println(nameList);





    }

}
