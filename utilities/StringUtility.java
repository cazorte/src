package utilities;

import java.util.Arrays;

public class StringUtility {

    //prints each character of the given string
    public static void printEachChar(String str){

        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
        }
    }

    //reversed each character of the given string
    public static String reverse(String args){
        String result = "";

        for (int i = args.length()-1; i >=0 ; i--) {
            result +=""+ args.charAt(i);
        }


        return result;
    }

    //palindrome
    public static boolean isPalindrome (String str){
        boolean result = StringUtility.reverse(str).equalsIgnoreCase(str);
        return result;
    }

    //checks if the given string is anagram, return boolean
    public static boolean anagram(String str1, String str2){

        char[] ch1 = str1.toCharArray();
        char[] ch2 = str2.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        boolean result = Arrays.equals(ch1,ch2);

        return result;
    }

    //removes the duplicates from given string, return String.
    public static String removeDuplicates(String str){

        String result="";

        for (int i = 0; i < str.length(); i++) {
            char each =str.charAt(i);

            if (!result.contains(""+each)){
                result+=each;
            }
        }

        return result;
    }





}
