package day11_SwitchScanner;

public class NumberOfDay {

    public static void main(String[] args) {

        int month =2;
        String result="";
        int year=2024;

        if (month>0 && month<13){
            switch (month){
                case 2:
                    result= (year %4==0)? "29 days" : "28 days";
                break;
                case 4: case 6: case 9 : case 11:
                    result = "30 days";
                    break;
                default: result = "31 days";

            }

        }else System.out.println("Invalid Number");

        System.out.println(result);

    }
}
