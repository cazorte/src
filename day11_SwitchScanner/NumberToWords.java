package day11_SwitchScanner;

import java.util.Scanner;

public class NumberToWords {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number=10;
        System.out.println("please entry number");
        number =input.nextInt();

        String result="";
        if (number>=0 && number <=9){
            result = (number==0)? "zero" :(number==1)? "one" :(number==2)? "two" : (number==3)? "three" :(number==4)? "four" :(number==5)? "five" :(number==6)? "six" :
                    (number==7)? "seven" :(number==8)? "eight" :"nine" ;
            System.out.println(result);




        }else System.out.println("Invalid number");




    }




}
