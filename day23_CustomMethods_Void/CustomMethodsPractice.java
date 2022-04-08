package day23_CustomMethods_Void;

public class CustomMethodsPractice {

    public static void main(String[] args) {
        helloWorld5Times();
        helloCydeo5Times();


    }

    public static void helloWorld5Times() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello world");
        }

    }

    public static void helloCydeo5Times() {

        for (int i = 0; i < 5; i++) {
            System.out.println("Hello Cydeo");
        }
        String a ="hello";
        System.out.println(a.repeat(5));

    }





}
