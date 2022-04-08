package day17_While_DoWhile;

import java.util.Scanner;

public class MarryMe {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        System.out.println("Do you marry me?");
        String answer= input.next().toLowerCase();

 /*       if (answer.equals("yes")){
            System.out.println("Congats");
        }else if (answer.equals("no")){
            System.out.println("Goodbye");
        }else{  */
            while (!(answer.equals("yes") || answer.equals("no")   )    ){
                System.out.println("wrong answer, try again");

                answer= input.next().toLowerCase();
            }
            if (answer.equals("yes")){
                System.out.println("Congats");
            }else if (answer.equals("no")){
                System.out.println("Goodbye");}
        //}




    }
}
