package day10_NestedIf;

public class TernariesIntro {

    public static void main(String[] args) {

        int n = 100;

        if (n%2==0){
            System.out.println("Even");  //String
        }else{
            System.out.println("Odd");      //String
        }
        System.out.println("____________________________");

        String result = (n%2==0)? "even" : "odd";
        System.out.println(result);

        System.out.println("____________________________");
        int age =20;

        String result1= (age>=21)? "Eligible" : "Not eligible";
        System.out.println(result1);

        System.out.println("_______________________");

        int number =00;
        if (number>0){
            System.out.println("Positive");
        }else if (number<0){
            System.out.println("Negative");
        }else{
            System.out.println("Zero");
        }

        System.out.println("_________________");
        String result3 = (number>0)? "positive" : (number<0)? "negative" : "zero";
        System.out.println(result3);










    }



}
