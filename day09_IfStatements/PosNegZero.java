package day09_IfStatements;

public class PosNegZero {
    public static void main(String[] args) {

        int n=10;

        //noinspection ConstantConditions
        if (n>0)
            System.out.println("Positive");

        else if (n<0){
            System.out.println("Negative");
        }
        else {
            System.out.println("Zero");
        }


    }




}
