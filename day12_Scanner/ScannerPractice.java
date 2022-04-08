package day12_Scanner;

import java.util.Scanner;

public class ScannerPractice {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);


        System.out.println("Enter your name: ");
        String name =input.next();
        System.out.println("name = "+name);
        input.nextLine();

        String name2 =input.nextLine();
        System.out.println("name2 ="+name2);

        int age =input.nextInt();
        System.out.println("Age ="+age);
        input.nextLine();
        String asd  =input.nextLine();
        System.out.println("asd ="+asd);
        String dfgd=input.next();



        input.close();





    }
}
