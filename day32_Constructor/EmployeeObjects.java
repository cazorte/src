package day32_Constructor;

import java.util.Arrays;

public class EmployeeObjects {

    public static void main(String[] args) {

        Employee employee1 = new Employee("Anıl");
        System.out.println(employee1);
        Employee employee2 = new Employee("asd","salary", 'M', 40000) ;

        Employee employee3 = new Employee("qwe");

        System.out.println(employee2);
        System.out.println(employee3);

        int[] asd ={1,2,3,4,5,6};













        System.out.println(myMethod( 4, (short) 10));


    }



    public static short myMethod(int a, short b){
        short d = (short) (a*b);
        return d;
    }



}
