package day17_While_DoWhile;

import java.util.Scanner;

public class DoWhileExample {
    // sayı gir, sadece çift sayıları topla, neg girildiğinde bitir ve sonuç.
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int result = 0;
        int num = 0;
        do {
            System.out.println("Enter a number:");
            num = input.nextInt();
            if (num % 2 == 1) {
                result += num;
            }

        } while (num > 0);

        System.out.println("result: " + result);

    }




}
