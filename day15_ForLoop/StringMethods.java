package day15_ForLoop;

public class StringMethods {
    public static void main(String[] args) {

        String str =" ";

        boolean r = str.isEmpty();
        boolean b = str.isBlank();

        System.out.println("r = " + r);


        System.out.println("----------------");
        String input1= "I love JaVa";
        String input2 = "javA";

        System.out.println(input1.toLowerCase().contains(input2.toLowerCase()));





    }
}
