package day24_CustomMethod_Return;

public class ReturnMethodPractice {
    public static void main(String[] args) {


        System.out.println(max(120,150));
        int maxNumber = max(157,102);

        System.out.println(maxNumber);
        int multyp2x = maxNumber*2;
        System.out.println(multyp2x);


    }
    public static int max(int a, int b){
        int result =0;
        if (a>b){
            result = a;

        }else result =b;

        return result;



    }
    //Method^: find the max number 100 to 200. Then multiply the max number by 2...




}
