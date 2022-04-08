package day27_WrapperClasses;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WrapperClassesIntro {
    public static void main(String[] args) {



            int num1 = 200;

            // Long n1 =num1;
            Integer n1 = num1; //autoboxing
            Integer n5 = 200;

            int num2 = n1;  //unboxing

            System.out.println("------------------------------------");


            Integer integerValue = 100;

            long longValue = integerValue;
            double c = longValue;
            System.out.println(c);

            Byte b1 = 25;

            byte a1 = b1;
            short a2 = b1;
            int a3 = b1;
            long a4 = b1;

            System.out.println("------------------------------------");

            int num3 = 200;
             //Long l2 = num3;
            //  Double d1 = num3;

            Integer num4 = num3; //autoboxing


            System.out.println("------------------------------------");

            Integer z = 900;
            Integer y =z;

            System.out.println("---------------------------------");

            int[] numbers1 = {1,2,3,4,5};
            Integer[] numbers2 = {1,2,3,4,5};
            System.out.println("-----------------------");


            int num =10;
            Integer numObj = num;

            String str ="400";
            Integer a = Integer.valueOf(str);
            int g = Integer.valueOf(str);
            int d = Integer.parseInt(str);
            byte e = (byte) Integer.parseInt(str);
            long f = Integer.parseInt(str);
            Integer h = Integer.parseInt(str);

            a.intValue();
            h.intValue();


            System.out.println(a+d+e+f+g+h);

            String c2 = "abc".substring(2,3);
            System.out.println(c2);

            ArrayList<String> arrList = new ArrayList<>();
            arrList.add("apple");
            arrList.add("banana");
            arrList.add("orange");
            System.out.println(arrList);
            arrList.add("123");
            System.out.println(arrList);
            System.out.println("----------------");
            System.out.println(arrList.remove("123"));
            System.out.println(arrList);





    }
}
