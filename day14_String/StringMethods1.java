package day14_String;

public class StringMethods1 {

    public static void main(String[] args) {
        String str1 = "      eu 08  ";
        str1 = str1.trim();
        System.out.println("str1 = " + str1);

        System.out.println("--------------------");

        System.out.println(str1.lastIndexOf(" "));

        System.out.println("--------------");

        String str2 = "C is the fun, C is the cool!";

        str2 = str2.replace("c", "S");
        System.out.println(str2);
        str2 = str2.replaceFirst("the ", "R");
        System.out.println("str2 = " + str2);

        System.out.println("--------------");

        String word = "Cydeo School";
        String brand = word.substring(0, word.indexOf(" "));
        System.out.println("brand = " + brand);


    }
}
//3:05 da kaldım