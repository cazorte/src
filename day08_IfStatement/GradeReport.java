package day08_IfStatement;

public class GradeReport {
    public static void main(String[] args) {
        // System.out.println( true == !false);
        int score = 75;
        boolean a = score >=90 && score <= 100;
        boolean b = score >=80 && score <=89; // boolean b= score >=80 || !a;
        boolean c= score >=70 && !b && !a;
        boolean d= score >=60 && !b && !a && !c;
        boolean f = score >=0 &&!a && !b && !c && !d;
        if (a){
        System.out.println("Excellent!");}
        if (b){
        System.out.println("Great");}
        if (c){
        System.out.println("Good");}
        if (d){
        System.out.println("Passed");}
        if (f){
        System.out.println("Fail!");}












    }






}
