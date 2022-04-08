package utilities;

public class MathUtility {

    public static int sum(int num1, int num2){
        return num1+num2;
    }
    public static double sum(double num1, double num2){
        return num1+num2;
    }

    public static int subtract(int num1, int num2){
        return num1-num2;
    }
    public static double subtrac(double num1, double num2){
        return num1-num2;
    }

    public static int multiplication(int num1, int num2){
        return num1*num2;
    }
    public static double multiplication(double num1, double num2){
        return num1*num2;
    }

    public static double division(double num1, double num2){ return num1/num2; }

    public static boolean isEven(int number){
        if (number%2 == 0) return true;
        else return false;
    }
    public static boolean isOdd(int number){
        if (number%2 == 1) return true;
        else return false;
    }

    public static int max(int num1, int num2){
        if (num1>num2){
            return num1;
        }else return num2;
    }
    public static double max(double num1, double num2){
        if (num1>num2){
            return num1;
        }else return num2;
    }

    public static int min(int num1, int num2){
        if (num1>num2){
            return num2;
        }else return num1;
    }
    public static double min(double num1, int num2){
        if (num1>num2){
            return num2;
        }else return num1;
    }

    public static int square(int number){
        return number*number;
    }
    public static double square(double number){
        return number*number;
    }

    public static int cube(int number){
        return number*number*number;
    }
    public static double cube(double number){
        return number*number*number;
    }















}
