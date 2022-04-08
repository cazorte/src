package day18_NestedLoop;

import java.util.Locale;
import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        while (true) {
            System.out.println("Enter a number:");
            int num = input.nextInt();

            if (num % 2 == 0) {
                System.out.println("Even");
            } else if (num % 2 != 0) {
                System.out.println("Odd");
            }

            System.out.println("Would you enter another number?");
            String a = input.nextLine().toLowerCase();

            while ( !(a.equalsIgnoreCase("yes")  || a.equalsIgnoreCase("no"))    ){
                System.out.println("Please re-enter, Would you enter another number? ");
                a= input.nextLine().toLowerCase();
            }

            if (a.equalsIgnoreCase("no")) {
                break;
            }
        }

    }
}
