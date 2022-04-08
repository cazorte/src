package day15_ForLoop;

import java.util.Scanner;

public class ReverseWrite {
    public static void main(String[] args) {
        System.out.println("Please enter a word");
        String word=new Scanner(System.in).nextLine();
        String result="";

        for (int i = word.length()-1; i >-1 ; i--) {
            result += word.charAt(i);

        }
        System.out.println(result);



    }
}
