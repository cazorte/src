package day23_CustomMethods_Void;

public class CustomMethodsWithparameters {

    public static void main(String[] args) {
        oddOrEven(4);

        ageOfPerson(1987, 4);




    }

    //create a func. that can check if anumber is odd number or even number
    public static void oddOrEven(int number){
        if (number % 2 ==0){
            System.out.println(number + " is even number");
        }else{
            System.out.println(number + " is odd number");
        }
    }

    // create a function that can display the age of the person
    public  static  void  ageOfPerson( int birthYear, int asd){
        int age = 2022 - birthYear;
        System.out.println("Your age is: "+age);

    }


}