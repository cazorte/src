package day07_Operators;


public class Castings {
    public static void main(String[] args) {

        float averageScore = 20.53123121231242354667568967854563452f;

        byte num1 = (byte) averageScore; //explicit casting
        short num2 = (short) averageScore;
        double num3 = averageScore; // implicit casting
        float num4 = averageScore; //no casting
        long num5 = (long) averageScore; //explicite

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        System.out.println("num3 = " + num3);
        System.out.println("num4 = " + num4);
        System.out.println("num5 = " + num5);

    }















}
