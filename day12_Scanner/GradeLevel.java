package day12_Scanner;

public class GradeLevel {
    public static void main(String[] args) {
        byte number =10;
        String result= "";
/*
        if (number>01 && number <=18){
            switch (number){
                case 1: case 2: case 3: case 4: case 5:
                    System.out.println("");
            }



        }else result="Invalid result";
*/
        switch (number){
            case 1 : case 2: case 3: case 4: case 5:
                System.out.println("asdasda"); break;
            case 6: case 7:
                System.out.println("sdfasda"); break;


            default:
                System.out.println("Invalid number");
        }

    }



}
