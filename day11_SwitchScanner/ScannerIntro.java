package day11_SwitchScanner;

import java.util.Scanner;

public class ScannerIntro {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num1= input.nextInt();
        System.out.println( num1);
        double num2= input.nextDouble();
        System.out.println(num2);

        input.close();






    }
}
