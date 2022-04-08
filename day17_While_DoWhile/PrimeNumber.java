package day17_While_DoWhile;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        double number=2;// input.nextDouble();
        int result=0;
        for (int i = 2; i <number ; i++) {
            if (number%1==0 && number%i!=0 && number>1){
                result+=0;
            }else result+=1;

        }
        if (result>0 || number<2){
            System.out.println("this number isn't prime");
        }else System.out.println("this number is prime");



    }


}
