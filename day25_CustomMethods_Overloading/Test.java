package day25_CustomMethods_Overloading;


import utilities.StringUtility;

import java.util.Locale;

public class Test {

    public static void main(String[] args) {

        String str = "Java Programming Language";

        StringUtility.printEachChar(str);
        System.out.println("--------------");

        String asd =StringUtility.reverse(str);
        System.out.println(asd);
        System.out.println("----------------------");

        String word = "civiC";
        boolean as =StringUtility.isPalindrome(word);
        System.out.println("palindrome : "+as);

        System.out.println("------------");

        String[] names = {"Anna", "Java", "Python", "racecar", "Mom", "Cydeo"};

        int count=0;

        for (String each : names) {
            if(StringUtility.isPalindrome(each)){
                count++;
            }
        }

        System.out.println(count);

        System.out.println("-----------------------------------------");

        String word1="Anagram";
        String word2 ="margana";

        System.out.println("Anagram : "+StringUtility.anagram(word1.toLowerCase(),word2.toLowerCase()));

        System.out.println("----------------");

        String word3 = "aaaaabbbbccddddfre";

        System.out.println(StringUtility.removeDuplicates(word3));




    }


}
