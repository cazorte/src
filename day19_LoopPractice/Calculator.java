package day19_LoopPractice;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a number:");
        int num1 = scan.nextInt();
        scan.nextLine();

        System.out.println("Enter a math operator:");
        String entry=scan.nextLine();
        char operator = entry.charAt(0);

        if (   entry.length()>1 || !(operator == '+' || operator== '-')   ){
            System.err.println("Invalid math operator:" + entry);
            System.exit(0);
        }

        System.out.println("Enter a second number:");
        int num2 = scan.nextInt();


    }
}
