package day25_CustomMethods_Overloading;

public class SumOfNumbers {
    public static void main(String[] args) {

        int sum = sumOf2Numbers(10,20);

        System.out.println(sum);

    }



    public static int sumOf2Numbers(int num1, int num2){
        return num1+num2;
    }
}
