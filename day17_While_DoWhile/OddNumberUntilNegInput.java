package day17_While_DoWhile;

import java.util.Scanner;

public class OddNumberUntilNegInput {
    public static void main(String[] args) {
        int toplam=0;
        while(true){
            System.out.println("Please enter a number:");
            Scanner input= new Scanner(System.in);
            int number =input.nextInt();

            if (number <0){
                System.out.println("Programme is finished" );
                System.out.println("Sum of the entered odd number "+ toplam);
                break;
            }

            if (number%2==1){
                toplam+=number;
            }



        }



    }
}
