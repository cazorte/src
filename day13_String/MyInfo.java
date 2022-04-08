package day13_String;

import java.util.Scanner;


public class MyInfo {
    public static void main(String[] args) {

        String a ="Java";
        String b =new String("Ja    va   ");

        System.out.println(a.equals(b));
        System.out.println("---------------------");

        System.out.println(a.charAt(2));
        System.out.println("--------------------");

        char firstChar = a.charAt(0);
        char lastChar = a.charAt( a.length() - 1);
        System.out.println("lastChar = " + lastChar);
        System.out.println("firstChar = " + firstChar);







    }
}
